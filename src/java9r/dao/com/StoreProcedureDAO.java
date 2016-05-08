package java9r.dao.com;

import java.util.*;

import javax.xml.crypto.dsig.Transform;

import javassist.compiler.ast.Keyword;
import javassist.convert.Transformer;

import org.hibernate.*;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.hibernate.type.*;

import java9r.entites.com.*;
import java9r.util.com.HibernateUtil;

public class StoreProcedureDAO {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings("unchecked")

	/////////////////////////////////////// find one record start /////////////

	public Product findSP(Integer id) {
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			SQLQuery sqlq = sessionFactory.getCurrentSession().createSQLQuery("call findById(:id)");
			sqlq.setInteger("id", id);
			return (Product) sqlq.addEntity(Product.class).uniqueResult();

		} catch (Exception e) {
			return null;
		}
	}
	/////////////////////////////////////// find one record end /////////////

}
