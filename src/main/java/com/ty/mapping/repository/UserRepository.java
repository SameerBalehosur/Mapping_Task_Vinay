package com.ty.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.ty.mapping.model.Admin;
import com.ty.mapping.model.Coach;
import com.ty.mapping.model.Transformation;
import com.ty.mapping.model.Orders;
import com.ty.mapping.model.Plans;
import com.ty.mapping.model.Products;
import com.ty.mapping.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByuid(int uid);

//	@NoRepositoryBean
//	interface AdminRepository extends JpaRepository<Admin, Integer> {
//		public Admin findById(int id);
//	}
//
//	@NoRepositoryBean
//	interface CoachRepository extends JpaRepository<Coach, Integer> {
//		public Coach findById(int id);
//	}
//
//	@NoRepositoryBean
//	interface FeedabackRepository extends JpaRepository<Transformation, Integer> {
//		public Transformation findById(int id);
//	}
//
//	@NoRepositoryBean
//	interface OrderRepository extends JpaRepository<Orders, Integer> {
//		public Orders findById(int id);
//	}
//
//	@NoRepositoryBean
//	interface PlansRepository extends JpaRepository<Plans, Integer> {
//		public Plans findById(int id);
//	}
//
//	@NoRepositoryBean
//	interface ProductsRepository extends JpaRepository<Products, Integer> {
//		public Products findById(int id);
//	}
}
