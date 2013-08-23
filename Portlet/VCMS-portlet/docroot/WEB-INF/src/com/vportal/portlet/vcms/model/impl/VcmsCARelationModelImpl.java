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

package com.vportal.portlet.vcms.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.vportal.portlet.vcms.model.VcmsCARelation;
import com.vportal.portlet.vcms.model.VcmsCARelationModel;
import com.vportal.portlet.vcms.model.VcmsCARelationSoap;
import com.vportal.portlet.vcms.service.persistence.VcmsCARelationPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VcmsCARelation service. Represents a row in the &quot;VcmsCARelation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vcms.model.VcmsCARelationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsCARelationImpl}.
 * </p>
 *
 * @author hai
 * @see VcmsCARelationImpl
 * @see com.vportal.portlet.vcms.model.VcmsCARelation
 * @see com.vportal.portlet.vcms.model.VcmsCARelationModel
 * @generated
 */
@JSON(strict = true)
public class VcmsCARelationModelImpl extends BaseModelImpl<VcmsCARelation>
	implements VcmsCARelationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vcms c a relation model instance should use the {@link com.vportal.portlet.vcms.model.VcmsCARelation} interface instead.
	 */
	public static final String TABLE_NAME = "VcmsCARelation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "categoryId", Types.VARCHAR },
			{ "articleId", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdByUser", Types.VARCHAR },
			{ "status", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table VcmsCARelation (categoryId VARCHAR(75) not null,articleId VARCHAR(75) not null,createdDate DATE null,createdByUser VARCHAR(75) null,status LONG,primary key (categoryId, articleId))";
	public static final String TABLE_SQL_DROP = "drop table VcmsCARelation";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsCARelation.id.articleId DESC, vcmsCARelation.id.categoryId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsCARelation.articleId DESC, VcmsCARelation.categoryId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vcms.model.VcmsCARelation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vcms.model.VcmsCARelation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.vportal.portlet.vcms.model.VcmsCARelation"),
			true);
	public static long ARTICLEID_COLUMN_BITMASK = 1L;
	public static long CATEGORYID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VcmsCARelation toModel(VcmsCARelationSoap soapModel) {
		VcmsCARelation model = new VcmsCARelationImpl();

		model.setCategoryId(soapModel.getCategoryId());
		model.setArticleId(soapModel.getArticleId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VcmsCARelation> toModels(VcmsCARelationSoap[] soapModels) {
		List<VcmsCARelation> models = new ArrayList<VcmsCARelation>(soapModels.length);

		for (VcmsCARelationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vcms.model.VcmsCARelation"));

	public VcmsCARelationModelImpl() {
	}

	public VcmsCARelationPK getPrimaryKey() {
		return new VcmsCARelationPK(_categoryId, _articleId);
	}

	public void setPrimaryKey(VcmsCARelationPK primaryKey) {
		setCategoryId(primaryKey.categoryId);
		setArticleId(primaryKey.articleId);
	}

	public Serializable getPrimaryKeyObj() {
		return new VcmsCARelationPK(_categoryId, _articleId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((VcmsCARelationPK)primaryKeyObj);
	}

	public Class<?> getModelClass() {
		return VcmsCARelation.class;
	}

	public String getModelClassName() {
		return VcmsCARelation.class.getName();
	}

	@JSON
	public String getCategoryId() {
		if (_categoryId == null) {
			return StringPool.BLANK;
		}
		else {
			return _categoryId;
		}
	}

	public void setCategoryId(String categoryId) {
		_columnBitmask = -1L;

		if (_originalCategoryId == null) {
			_originalCategoryId = _categoryId;
		}

		_categoryId = categoryId;
	}

	public String getOriginalCategoryId() {
		return GetterUtil.getString(_originalCategoryId);
	}

	@JSON
	public String getArticleId() {
		if (_articleId == null) {
			return StringPool.BLANK;
		}
		else {
			return _articleId;
		}
	}

	public void setArticleId(String articleId) {
		_columnBitmask = -1L;

		if (_originalArticleId == null) {
			_originalArticleId = _articleId;
		}

		_articleId = articleId;
	}

	public String getOriginalArticleId() {
		return GetterUtil.getString(_originalArticleId);
	}

	@JSON
	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@JSON
	public String getCreatedByUser() {
		if (_createdByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdByUser;
		}
	}

	public void setCreatedByUser(String createdByUser) {
		_createdByUser = createdByUser;
	}

	@JSON
	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VcmsCARelation toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (VcmsCARelation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		VcmsCARelationImpl vcmsCARelationImpl = new VcmsCARelationImpl();

		vcmsCARelationImpl.setCategoryId(getCategoryId());
		vcmsCARelationImpl.setArticleId(getArticleId());
		vcmsCARelationImpl.setCreatedDate(getCreatedDate());
		vcmsCARelationImpl.setCreatedByUser(getCreatedByUser());
		vcmsCARelationImpl.setStatus(getStatus());

		vcmsCARelationImpl.resetOriginalValues();

		return vcmsCARelationImpl;
	}

	public int compareTo(VcmsCARelation vcmsCARelation) {
		int value = 0;

		value = getArticleId().compareTo(vcmsCARelation.getArticleId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getCategoryId().compareTo(vcmsCARelation.getCategoryId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		VcmsCARelation vcmsCARelation = null;

		try {
			vcmsCARelation = (VcmsCARelation)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		VcmsCARelationPK primaryKey = vcmsCARelation.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		VcmsCARelationModelImpl vcmsCARelationModelImpl = this;

		vcmsCARelationModelImpl._originalCategoryId = vcmsCARelationModelImpl._categoryId;

		vcmsCARelationModelImpl._originalArticleId = vcmsCARelationModelImpl._articleId;

		vcmsCARelationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VcmsCARelation> toCacheModel() {
		VcmsCARelationCacheModel vcmsCARelationCacheModel = new VcmsCARelationCacheModel();

		vcmsCARelationCacheModel.categoryId = getCategoryId();

		String categoryId = vcmsCARelationCacheModel.categoryId;

		if ((categoryId != null) && (categoryId.length() == 0)) {
			vcmsCARelationCacheModel.categoryId = null;
		}

		vcmsCARelationCacheModel.articleId = getArticleId();

		String articleId = vcmsCARelationCacheModel.articleId;

		if ((articleId != null) && (articleId.length() == 0)) {
			vcmsCARelationCacheModel.articleId = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vcmsCARelationCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vcmsCARelationCacheModel.createdDate = Long.MIN_VALUE;
		}

		vcmsCARelationCacheModel.createdByUser = getCreatedByUser();

		String createdByUser = vcmsCARelationCacheModel.createdByUser;

		if ((createdByUser != null) && (createdByUser.length() == 0)) {
			vcmsCARelationCacheModel.createdByUser = null;
		}

		vcmsCARelationCacheModel.status = getStatus();

		return vcmsCARelationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{categoryId=");
		sb.append(getCategoryId());
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vcms.model.VcmsCARelation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VcmsCARelation.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			VcmsCARelation.class
		};
	private String _categoryId;
	private String _originalCategoryId;
	private String _articleId;
	private String _originalArticleId;
	private Date _createdDate;
	private String _createdByUser;
	private long _status;
	private long _columnBitmask;
	private VcmsCARelation _escapedModelProxy;
}