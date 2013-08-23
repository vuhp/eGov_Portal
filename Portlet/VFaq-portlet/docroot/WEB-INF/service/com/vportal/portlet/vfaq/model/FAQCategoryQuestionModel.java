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

package com.vportal.portlet.vfaq.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the FAQCategoryQuestion service. Represents a row in the &quot;FAQCategoryQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.vportal.portlet.vfaq.model.impl.FAQCategoryQuestionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.vportal.portlet.vfaq.model.impl.FAQCategoryQuestionImpl}.
 * </p>
 *
 * @author DucNN
 * @see FAQCategoryQuestion
 * @see com.vportal.portlet.vfaq.model.impl.FAQCategoryQuestionImpl
 * @see com.vportal.portlet.vfaq.model.impl.FAQCategoryQuestionModelImpl
 * @generated
 */
public interface FAQCategoryQuestionModel extends BaseModel<FAQCategoryQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a f a q category question model instance should use the {@link FAQCategoryQuestion} interface instead.
	 */

	/**
	 * Returns the primary key of this f a q category question.
	 *
	 * @return the primary key of this f a q category question
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this f a q category question.
	 *
	 * @param primaryKey the primary key of this f a q category question
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this f a q category question.
	 *
	 * @return the uuid of this f a q category question
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this f a q category question.
	 *
	 * @param uuid the uuid of this f a q category question
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this f a q category question.
	 *
	 * @return the ID of this f a q category question
	 */
	public long getId();

	/**
	 * Sets the ID of this f a q category question.
	 *
	 * @param id the ID of this f a q category question
	 */
	public void setId(long id);

	/**
	 * Returns the question ID of this f a q category question.
	 *
	 * @return the question ID of this f a q category question
	 */
	public long getQuestionId();

	/**
	 * Sets the question ID of this f a q category question.
	 *
	 * @param questionId the question ID of this f a q category question
	 */
	public void setQuestionId(long questionId);

	/**
	 * Returns the category ID of this f a q category question.
	 *
	 * @return the category ID of this f a q category question
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this f a q category question.
	 *
	 * @param categoryId the category ID of this f a q category question
	 */
	public void setCategoryId(long categoryId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(FAQCategoryQuestion faqCategoryQuestion);

	public int hashCode();

	public CacheModel<FAQCategoryQuestion> toCacheModel();

	public FAQCategoryQuestion toEscapedModel();

	public String toString();

	public String toXmlString();
}