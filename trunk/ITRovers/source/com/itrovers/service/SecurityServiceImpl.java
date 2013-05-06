package com.itrovers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itrovers.dao.SecurityDao;
import com.itrovers.domain.Feature;
import com.itrovers.domain.Authority;
import com.itrovers.domain.AuthorizedGroups;
import com.itrovers.domain.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private SecurityDao securityDao;
	
	@Override
	public List<Authority> findAllAuthorities(
			List<AuthorizedGroups> authorizedGroups) {
		return securityDao.findAllAuthorities(authorizedGroups);
	}

	@Override
	public List<Feature> findAllFeatures(List<Authority> authorities) {
		return securityDao.findAllFeatures(authorities);
	}

    @Override
    public Component getComponentById(Long componentId){
        return securityDao.getComponentById(componentId);
    }
    @Override
    public Component getComponentByName(String componentName){
       return securityDao.getComponentByName(componentName);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
    public boolean save(AuthorizedGroups authorizedGroups) {
        return securityDao.save(authorizedGroups);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public boolean save(Feature feature) {
		return securityDao.save(feature);
	}
    @Override
    public Feature findFeatureByOperation(String operation){
      return securityDao.findFeatureByOperation(operation);
    }

	@Override
	public List<Feature> findAllFeatures() {
		return securityDao.findAllFeatures();
	}

	@Override
	public boolean delete(Feature feature) {
		return securityDao.delete(feature);
	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public boolean save(Authority authority) {
		return securityDao.save(authority);
	}

	@Override
	public List<Authority> findAllAuthorities() {
		return securityDao.findAllAuthorities();
	}

	@Override
	public Authority findByAuthorityName(String authorityName) {
		return securityDao.findByAuthorityName(authorityName);
	}

	@Override
	public boolean delete(Authority authority) {
		return securityDao.delete(authority);
	}

	@Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	public boolean save(Component component) {
		return securityDao.save(component);
	}

	@Override
	public List<Component> findAllComponents() {
		return securityDao.findAllComponents();
	}

	@Override
	public boolean delete(Component component) {
		return securityDao.delete(component);
	}
    @Override
    public List<AuthorizedGroups> findAllAuthorizedGroup(){
        return securityDao.findAllAuthorizedGroup();
    }

}
