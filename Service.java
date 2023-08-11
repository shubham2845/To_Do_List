package mypackage.sts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.sts.entity.entity;
import mypackage.sts.repository.Repo;

@Service
public class service {
	@Autowired 
	public Repo r;
	public void addtodoo(entity e)
	{
		r.save(e);
	}
	
	public List<entity> getAllEmp() {
		return r.findAll();
	}
	
	public entity getMPBuId(int id)
	{
		Optional<entity>e=r.findById(id);
		if(e.isPresent())
		{
			return e.get();
		}
		return null;
	}
	
	public void deletetodo(int id)
	{
		r.deleteById(id);
	}
	
}
