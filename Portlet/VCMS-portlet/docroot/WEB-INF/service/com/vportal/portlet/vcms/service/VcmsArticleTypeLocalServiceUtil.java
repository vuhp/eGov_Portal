/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.vportal.portlet.vcms.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the vcms article type local service. This utility wraps {@link com.vportal.portlet.vcms.service.impl.VcmsArticleTypeLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author hai
 * @see VcmsArticleTypeLocalService
 * @see com.vportal.portlet.vcms.service.base.VcmsArticleTypeLocalServiceBaseImpl
 * @see com.vportal.portlet.vcms.service.impl.VcmsArticleTypeLocalServiceImpl
 * @generated
 */
public class VcmsArticleTypeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vcms.service.impl.VcmsArticleTypeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vcms article type to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleType the vcms article type
	* @return the vcms article type that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticleType addVcmsArticleType(
		com.vportal.portlet.vcms.model.VcmsArticleType vcmsArticleType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVcmsArticleType(vcmsArticleType);
	}

	/**
	* Creates a new vcms article type with the primary key. Does not add the vcms article type to the database.
	*
	* @param vcmsArticleTypePK the primary key for the new vcms article type
	* @return the new vcms article type
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticleType createVcmsArticleType(
		com.vportal.portlet.vcms.service.persistence.VcmsArticleTypePK vcmsArticleTypePK) {
		return getService().createVcmsArticleType(vcmsArticleTypePK);
	}

	/**
	* Deletes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @throws PortalException if a vcms article type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVcmsArticleType(
		com.vportal.portlet.vcms.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVcmsArticleType(vcmsArticleTypePK);
	}

	/**
	* Deletes the vcms article type from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleType the vcms article type
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVcmsArticleType(
		com.vportal.portlet.vcms.model.VcmsArticleType vcmsArticleType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVcmsArticleType(vcmsArticleType);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.vportal.portlet.vcms.model.VcmsArticleType fetchVcmsArticleType(
		com.vportal.portlet.vcms.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVcmsArticleType(vcmsArticleTypePK);
	}

	/**
	* Returns the vcms article type with the primary key.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type
	* @throws PortalException if a vcms article type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticleType getVcmsArticleType(
		com.vportal.portlet.vcms.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVcmsArticleType(vcmsArticleTypePK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of vcms article types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vcms.model.VcmsArticleType> getVcmsArticleTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVcmsArticleTypes(start, end);
	}

	/**
	* Returns the number of vcms article types.
	*
	* @return the number of vcms article types
	* @throws SystemException if a system exception occurred
	*/
	public static int getVcmsArticleTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVcmsArticleTypesCount();
	}

	/**
	* Updates the vcms article type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleType the vcms article type
	* @return the vcms article type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticleType updateVcmsArticleType(
		com.vportal.portlet.vcms.model.VcmsArticleType vcmsArticleType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVcmsArticleType(vcmsArticleType);
	}

	/**
	* Updates the vcms article type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleType the vcms article type
	* @param merge whether to merge the vcms article type with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the vcms article type that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vcms.model.VcmsArticleType updateVcmsArticleType(
		com.vportal.portlet.vcms.model.VcmsArticleType vcmsArticleType,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVcmsArticleType(vcmsArticleType, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static com.vportal.portlet.vcms.model.VcmsArticleType addArticleType(
		java.lang.String articleId, long typeId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().addArticleType(articleId, typeId, position);
	}

	public static void deleteRelationByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelationByArticleId(articleId);
	}

	public static void deleteRelationByTypeId(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelationByTypeId(typeId);
	}

	public static java.util.List getByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByArticleId(articleId);
	}

	public static java.util.List getByArticleId(java.lang.String articleId,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByArticleId(articleId, begin, end);
	}

	public static int countByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countByArticleId(articleId);
	}

	public static java.util.List getByTypeId(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByTypeId(typeId);
	}

	public static java.util.List getByTypeId(long typeId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getByTypeId(typeId, begin, end);
	}

	public static int countByTypeId(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countByTypeId(typeId);
	}

	public static com.vportal.portlet.vcms.model.VcmsArticleType getArticleType(
		long typeId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getArticleType(typeId, articleId);
	}

	public static void clearService() {
		_service = null;
	}

	public static VcmsArticleTypeLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VcmsArticleTypeLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					VcmsArticleTypeLocalService.class.getName(),
					portletClassLoader);

			_service = new VcmsArticleTypeLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(VcmsArticleTypeLocalServiceUtil.class,
				"_service");
			MethodCache.remove(VcmsArticleTypeLocalService.class);
		}

		return _service;
	}

	public void setService(VcmsArticleTypeLocalService service) {
		MethodCache.remove(VcmsArticleTypeLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(VcmsArticleTypeLocalServiceUtil.class,
			"_service");
		MethodCache.remove(VcmsArticleTypeLocalService.class);
	}

	private static VcmsArticleTypeLocalService _service;
}