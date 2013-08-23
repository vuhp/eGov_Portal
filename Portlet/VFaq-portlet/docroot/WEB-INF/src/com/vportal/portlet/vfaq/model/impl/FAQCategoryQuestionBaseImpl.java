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

package com.vportal.portlet.vfaq.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.vportal.portlet.vfaq.model.FAQCategoryQuestion;
import com.vportal.portlet.vfaq.service.FAQCategoryQuestionLocalServiceUtil;

/**
 * The extended model base implementation for the FAQCategoryQuestion service. Represents a row in the &quot;FAQCategoryQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQCategoryQuestionImpl}.
 * </p>
 *
 * @author DucNN
 * @see FAQCategoryQuestionImpl
 * @see com.vportal.portlet.vfaq.model.FAQCategoryQuestion
 * @generated
 */
public abstract class FAQCategoryQuestionBaseImpl
	extends FAQCategoryQuestionModelImpl implements FAQCategoryQuestion {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a f a q category question model instance should use the {@link FAQCategoryQuestion} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			FAQCategoryQuestionLocalServiceUtil.addFAQCategoryQuestion(this);
		}
		else {
			FAQCategoryQuestionLocalServiceUtil.updateFAQCategoryQuestion(this);
		}
	}
}