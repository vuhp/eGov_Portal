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

package com.vportal.portlet.vfaq.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the f a q category question local service. This utility wraps {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author DucNN
 * @see FAQCategoryQuestionLocalService
 * @see com.vportal.portlet.vfaq.service.base.FAQCategoryQuestionLocalServiceBaseImpl
 * @see com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionLocalServiceImpl
 * @generated
 */
public class FAQCategoryQuestionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.vportal.portlet.vfaq.service.impl.FAQCategoryQuestionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the f a q category question to the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question
	* @return the f a q category question that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion addFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	*
	* @param id the primary key for the new f a q category question
	* @return the new f a q category question
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion createFAQCategoryQuestion(
		long id) {
		return getService().createFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category question
	* @throws PortalException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFAQCategoryQuestion(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteFAQCategoryQuestion(id);
	}

	/**
	* Deletes the f a q category question from the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteFAQCategoryQuestion(faqCategoryQuestion);
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

	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion fetchFAQCategoryQuestion(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFAQCategoryQuestion(id);
	}

	/**
	* Returns the f a q category question with the primary key.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question
	* @throws PortalException if a f a q category question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion getFAQCategoryQuestion(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategoryQuestion(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @return the range of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vportal.portlet.vfaq.model.FAQCategoryQuestion> getFAQCategoryQuestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategoryQuestions(start, end);
	}

	/**
	* Returns the number of f a q category questions.
	*
	* @return the number of f a q category questions
	* @throws SystemException if a system exception occurred
	*/
	public static int getFAQCategoryQuestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFAQCategoryQuestionsCount();
	}

	/**
	* Updates the f a q category question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question
	* @return the f a q category question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion updateFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFAQCategoryQuestion(faqCategoryQuestion);
	}

	/**
	* Updates the f a q category question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqCategoryQuestion the f a q category question
	* @param merge whether to merge the f a q category question with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the f a q category question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion updateFAQCategoryQuestion(
		com.vportal.portlet.vfaq.model.FAQCategoryQuestion faqCategoryQuestion,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFAQCategoryQuestion(faqCategoryQuestion, merge);
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

	public static com.vportal.portlet.vfaq.model.FAQCategoryQuestion addCategoryQuestion(
		long categoryId, long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addCategoryQuestion(categoryId, questionId);
	}

	public static void deleteByQuestionId(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteByQuestionId(questionId);
	}

	public static void deleteByCategoryId(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteByCategoryId(categoryId);
	}

	public static java.util.List getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAll();
	}

	public static java.util.List getQuestionsInCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestionsInCategory(categoryId);
	}

	public static java.util.List getCategoriesOfQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategoriesOfQuestion(questionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FAQCategoryQuestionLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FAQCategoryQuestionLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					FAQCategoryQuestionLocalService.class.getName(),
					portletClassLoader);

			_service = new FAQCategoryQuestionLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(FAQCategoryQuestionLocalServiceUtil.class,
				"_service");
			MethodCache.remove(FAQCategoryQuestionLocalService.class);
		}

		return _service;
	}

	public void setService(FAQCategoryQuestionLocalService service) {
		MethodCache.remove(FAQCategoryQuestionLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(FAQCategoryQuestionLocalServiceUtil.class,
			"_service");
		MethodCache.remove(FAQCategoryQuestionLocalService.class);
	}

	private static FAQCategoryQuestionLocalService _service;
}