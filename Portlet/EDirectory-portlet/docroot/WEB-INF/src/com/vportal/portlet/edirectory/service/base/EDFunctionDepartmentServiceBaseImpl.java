/**
 * Copyright (c) Vietsoftware, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vportal.portlet.edirectory.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.base.PrincipalBean;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.vportal.portlet.edirectory.model.EDFunctionDepartment;
import com.vportal.portlet.edirectory.service.EDDepartmentLocalService;
import com.vportal.portlet.edirectory.service.EDDepartmentService;
import com.vportal.portlet.edirectory.service.EDEmployeeLocalService;
import com.vportal.portlet.edirectory.service.EDEmployeeService;
import com.vportal.portlet.edirectory.service.EDFunctionDepartmentLocalService;
import com.vportal.portlet.edirectory.service.EDFunctionDepartmentService;
import com.vportal.portlet.edirectory.service.EDFunctionEmployeeLocalService;
import com.vportal.portlet.edirectory.service.EDFunctionEmployeeService;
import com.vportal.portlet.edirectory.service.EDFunctionLocalService;
import com.vportal.portlet.edirectory.service.EDFunctionService;
import com.vportal.portlet.edirectory.service.persistence.EDDepartmentPersistence;
import com.vportal.portlet.edirectory.service.persistence.EDEmployeeFinder;
import com.vportal.portlet.edirectory.service.persistence.EDEmployeePersistence;
import com.vportal.portlet.edirectory.service.persistence.EDFunctionDepartmentPersistence;
import com.vportal.portlet.edirectory.service.persistence.EDFunctionEmployeePersistence;
import com.vportal.portlet.edirectory.service.persistence.EDFunctionPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the e d function department remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vportal.portlet.edirectory.service.impl.EDFunctionDepartmentServiceImpl}.
 * </p>
 *
 * @author HOAN
 * @see com.vportal.portlet.edirectory.service.impl.EDFunctionDepartmentServiceImpl
 * @see com.vportal.portlet.edirectory.service.EDFunctionDepartmentServiceUtil
 * @generated
 */
public abstract class EDFunctionDepartmentServiceBaseImpl extends PrincipalBean
	implements EDFunctionDepartmentService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.vportal.portlet.edirectory.service.EDFunctionDepartmentServiceUtil} to access the e d function department remote service.
	 */

	/**
	 * Returns the e d department local service.
	 *
	 * @return the e d department local service
	 */
	public EDDepartmentLocalService getEDDepartmentLocalService() {
		return edDepartmentLocalService;
	}

	/**
	 * Sets the e d department local service.
	 *
	 * @param edDepartmentLocalService the e d department local service
	 */
	public void setEDDepartmentLocalService(
		EDDepartmentLocalService edDepartmentLocalService) {
		this.edDepartmentLocalService = edDepartmentLocalService;
	}

	/**
	 * Returns the e d department remote service.
	 *
	 * @return the e d department remote service
	 */
	public EDDepartmentService getEDDepartmentService() {
		return edDepartmentService;
	}

	/**
	 * Sets the e d department remote service.
	 *
	 * @param edDepartmentService the e d department remote service
	 */
	public void setEDDepartmentService(EDDepartmentService edDepartmentService) {
		this.edDepartmentService = edDepartmentService;
	}

	/**
	 * Returns the e d department persistence.
	 *
	 * @return the e d department persistence
	 */
	public EDDepartmentPersistence getEDDepartmentPersistence() {
		return edDepartmentPersistence;
	}

	/**
	 * Sets the e d department persistence.
	 *
	 * @param edDepartmentPersistence the e d department persistence
	 */
	public void setEDDepartmentPersistence(
		EDDepartmentPersistence edDepartmentPersistence) {
		this.edDepartmentPersistence = edDepartmentPersistence;
	}

	/**
	 * Returns the e d employee local service.
	 *
	 * @return the e d employee local service
	 */
	public EDEmployeeLocalService getEDEmployeeLocalService() {
		return edEmployeeLocalService;
	}

	/**
	 * Sets the e d employee local service.
	 *
	 * @param edEmployeeLocalService the e d employee local service
	 */
	public void setEDEmployeeLocalService(
		EDEmployeeLocalService edEmployeeLocalService) {
		this.edEmployeeLocalService = edEmployeeLocalService;
	}

	/**
	 * Returns the e d employee remote service.
	 *
	 * @return the e d employee remote service
	 */
	public EDEmployeeService getEDEmployeeService() {
		return edEmployeeService;
	}

	/**
	 * Sets the e d employee remote service.
	 *
	 * @param edEmployeeService the e d employee remote service
	 */
	public void setEDEmployeeService(EDEmployeeService edEmployeeService) {
		this.edEmployeeService = edEmployeeService;
	}

	/**
	 * Returns the e d employee persistence.
	 *
	 * @return the e d employee persistence
	 */
	public EDEmployeePersistence getEDEmployeePersistence() {
		return edEmployeePersistence;
	}

	/**
	 * Sets the e d employee persistence.
	 *
	 * @param edEmployeePersistence the e d employee persistence
	 */
	public void setEDEmployeePersistence(
		EDEmployeePersistence edEmployeePersistence) {
		this.edEmployeePersistence = edEmployeePersistence;
	}

	/**
	 * Returns the e d employee finder.
	 *
	 * @return the e d employee finder
	 */
	public EDEmployeeFinder getEDEmployeeFinder() {
		return edEmployeeFinder;
	}

	/**
	 * Sets the e d employee finder.
	 *
	 * @param edEmployeeFinder the e d employee finder
	 */
	public void setEDEmployeeFinder(EDEmployeeFinder edEmployeeFinder) {
		this.edEmployeeFinder = edEmployeeFinder;
	}

	/**
	 * Returns the e d function local service.
	 *
	 * @return the e d function local service
	 */
	public EDFunctionLocalService getEDFunctionLocalService() {
		return edFunctionLocalService;
	}

	/**
	 * Sets the e d function local service.
	 *
	 * @param edFunctionLocalService the e d function local service
	 */
	public void setEDFunctionLocalService(
		EDFunctionLocalService edFunctionLocalService) {
		this.edFunctionLocalService = edFunctionLocalService;
	}

	/**
	 * Returns the e d function remote service.
	 *
	 * @return the e d function remote service
	 */
	public EDFunctionService getEDFunctionService() {
		return edFunctionService;
	}

	/**
	 * Sets the e d function remote service.
	 *
	 * @param edFunctionService the e d function remote service
	 */
	public void setEDFunctionService(EDFunctionService edFunctionService) {
		this.edFunctionService = edFunctionService;
	}

	/**
	 * Returns the e d function persistence.
	 *
	 * @return the e d function persistence
	 */
	public EDFunctionPersistence getEDFunctionPersistence() {
		return edFunctionPersistence;
	}

	/**
	 * Sets the e d function persistence.
	 *
	 * @param edFunctionPersistence the e d function persistence
	 */
	public void setEDFunctionPersistence(
		EDFunctionPersistence edFunctionPersistence) {
		this.edFunctionPersistence = edFunctionPersistence;
	}

	/**
	 * Returns the e d function department local service.
	 *
	 * @return the e d function department local service
	 */
	public EDFunctionDepartmentLocalService getEDFunctionDepartmentLocalService() {
		return edFunctionDepartmentLocalService;
	}

	/**
	 * Sets the e d function department local service.
	 *
	 * @param edFunctionDepartmentLocalService the e d function department local service
	 */
	public void setEDFunctionDepartmentLocalService(
		EDFunctionDepartmentLocalService edFunctionDepartmentLocalService) {
		this.edFunctionDepartmentLocalService = edFunctionDepartmentLocalService;
	}

	/**
	 * Returns the e d function department remote service.
	 *
	 * @return the e d function department remote service
	 */
	public EDFunctionDepartmentService getEDFunctionDepartmentService() {
		return edFunctionDepartmentService;
	}

	/**
	 * Sets the e d function department remote service.
	 *
	 * @param edFunctionDepartmentService the e d function department remote service
	 */
	public void setEDFunctionDepartmentService(
		EDFunctionDepartmentService edFunctionDepartmentService) {
		this.edFunctionDepartmentService = edFunctionDepartmentService;
	}

	/**
	 * Returns the e d function department persistence.
	 *
	 * @return the e d function department persistence
	 */
	public EDFunctionDepartmentPersistence getEDFunctionDepartmentPersistence() {
		return edFunctionDepartmentPersistence;
	}

	/**
	 * Sets the e d function department persistence.
	 *
	 * @param edFunctionDepartmentPersistence the e d function department persistence
	 */
	public void setEDFunctionDepartmentPersistence(
		EDFunctionDepartmentPersistence edFunctionDepartmentPersistence) {
		this.edFunctionDepartmentPersistence = edFunctionDepartmentPersistence;
	}

	/**
	 * Returns the e d function employee local service.
	 *
	 * @return the e d function employee local service
	 */
	public EDFunctionEmployeeLocalService getEDFunctionEmployeeLocalService() {
		return edFunctionEmployeeLocalService;
	}

	/**
	 * Sets the e d function employee local service.
	 *
	 * @param edFunctionEmployeeLocalService the e d function employee local service
	 */
	public void setEDFunctionEmployeeLocalService(
		EDFunctionEmployeeLocalService edFunctionEmployeeLocalService) {
		this.edFunctionEmployeeLocalService = edFunctionEmployeeLocalService;
	}

	/**
	 * Returns the e d function employee remote service.
	 *
	 * @return the e d function employee remote service
	 */
	public EDFunctionEmployeeService getEDFunctionEmployeeService() {
		return edFunctionEmployeeService;
	}

	/**
	 * Sets the e d function employee remote service.
	 *
	 * @param edFunctionEmployeeService the e d function employee remote service
	 */
	public void setEDFunctionEmployeeService(
		EDFunctionEmployeeService edFunctionEmployeeService) {
		this.edFunctionEmployeeService = edFunctionEmployeeService;
	}

	/**
	 * Returns the e d function employee persistence.
	 *
	 * @return the e d function employee persistence
	 */
	public EDFunctionEmployeePersistence getEDFunctionEmployeePersistence() {
		return edFunctionEmployeePersistence;
	}

	/**
	 * Sets the e d function employee persistence.
	 *
	 * @param edFunctionEmployeePersistence the e d function employee persistence
	 */
	public void setEDFunctionEmployeePersistence(
		EDFunctionEmployeePersistence edFunctionEmployeePersistence) {
		this.edFunctionEmployeePersistence = edFunctionEmployeePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	protected Class<?> getModelClass() {
		return EDFunctionDepartment.class;
	}

	protected String getModelClassName() {
		return EDFunctionDepartment.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = edFunctionDepartmentPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = EDDepartmentLocalService.class)
	protected EDDepartmentLocalService edDepartmentLocalService;
	@BeanReference(type = EDDepartmentService.class)
	protected EDDepartmentService edDepartmentService;
	@BeanReference(type = EDDepartmentPersistence.class)
	protected EDDepartmentPersistence edDepartmentPersistence;
	@BeanReference(type = EDEmployeeLocalService.class)
	protected EDEmployeeLocalService edEmployeeLocalService;
	@BeanReference(type = EDEmployeeService.class)
	protected EDEmployeeService edEmployeeService;
	@BeanReference(type = EDEmployeePersistence.class)
	protected EDEmployeePersistence edEmployeePersistence;
	@BeanReference(type = EDEmployeeFinder.class)
	protected EDEmployeeFinder edEmployeeFinder;
	@BeanReference(type = EDFunctionLocalService.class)
	protected EDFunctionLocalService edFunctionLocalService;
	@BeanReference(type = EDFunctionService.class)
	protected EDFunctionService edFunctionService;
	@BeanReference(type = EDFunctionPersistence.class)
	protected EDFunctionPersistence edFunctionPersistence;
	@BeanReference(type = EDFunctionDepartmentLocalService.class)
	protected EDFunctionDepartmentLocalService edFunctionDepartmentLocalService;
	@BeanReference(type = EDFunctionDepartmentService.class)
	protected EDFunctionDepartmentService edFunctionDepartmentService;
	@BeanReference(type = EDFunctionDepartmentPersistence.class)
	protected EDFunctionDepartmentPersistence edFunctionDepartmentPersistence;
	@BeanReference(type = EDFunctionEmployeeLocalService.class)
	protected EDFunctionEmployeeLocalService edFunctionEmployeeLocalService;
	@BeanReference(type = EDFunctionEmployeeService.class)
	protected EDFunctionEmployeeService edFunctionEmployeeService;
	@BeanReference(type = EDFunctionEmployeePersistence.class)
	protected EDFunctionEmployeePersistence edFunctionEmployeePersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
}