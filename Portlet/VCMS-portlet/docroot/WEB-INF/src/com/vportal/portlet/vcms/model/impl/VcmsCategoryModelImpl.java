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

import com.vportal.portlet.vcms.model.VcmsCategory;
import com.vportal.portlet.vcms.model.VcmsCategoryModel;
import com.vportal.portlet.vcms.model.VcmsCategorySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VcmsCategory service. Represents a row in the &quot;VcmsCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vcms.model.VcmsCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsCategoryImpl}.
 * </p>
 *
 * @author hai
 * @see VcmsCategoryImpl
 * @see com.vportal.portlet.vcms.model.VcmsCategory
 * @see com.vportal.portlet.vcms.model.VcmsCategoryModel
 * @generated
 */
@JSON(strict = true)
public class VcmsCategoryModelImpl extends BaseModelImpl<VcmsCategory>
	implements VcmsCategoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vcms category model instance should use the {@link com.vportal.portlet.vcms.model.VcmsCategory} interface instead.
	 */
	public static final String TABLE_NAME = "VcmsCategory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "categoryId", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdByUser", Types.VARCHAR },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "modifiedByUser", Types.VARCHAR },
			{ "portionId", Types.VARCHAR },
			{ "parentId", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "anchored", Types.BOOLEAN },
			{ "href", Types.VARCHAR },
			{ "language", Types.VARCHAR },
			{ "hasImage", Types.BOOLEAN },
			{ "image", Types.VARCHAR },
			{ "position", Types.BIGINT },
			{ "userHit", Types.BIGINT },
			{ "rssable", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table VcmsCategory (categoryId VARCHAR(75) not null primary key,groupId LONG,companyId LONG,createdDate DATE null,createdByUser VARCHAR(75) null,modifiedDate DATE null,modifiedByUser VARCHAR(75) null,portionId VARCHAR(75) null,parentId VARCHAR(75) null,name VARCHAR(1000) null,description VARCHAR(2000) null,anchored BOOLEAN,href VARCHAR(500) null,language VARCHAR(75) null,hasImage BOOLEAN,image VARCHAR(1000) null,position LONG,userHit LONG,rssable BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table VcmsCategory";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsCategory.position ASC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsCategory.position ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vcms.model.VcmsCategory"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vcms.model.VcmsCategory"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.vportal.portlet.vcms.model.VcmsCategory"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long LANGUAGE_COLUMN_BITMASK = 2L;
	public static long PARENTID_COLUMN_BITMASK = 4L;
	public static long PORTIONID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VcmsCategory toModel(VcmsCategorySoap soapModel) {
		VcmsCategory model = new VcmsCategoryImpl();

		model.setCategoryId(soapModel.getCategoryId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setPortionId(soapModel.getPortionId());
		model.setParentId(soapModel.getParentId());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setAnchored(soapModel.getAnchored());
		model.setHref(soapModel.getHref());
		model.setLanguage(soapModel.getLanguage());
		model.setHasImage(soapModel.getHasImage());
		model.setImage(soapModel.getImage());
		model.setPosition(soapModel.getPosition());
		model.setUserHit(soapModel.getUserHit());
		model.setRssable(soapModel.getRssable());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VcmsCategory> toModels(VcmsCategorySoap[] soapModels) {
		List<VcmsCategory> models = new ArrayList<VcmsCategory>(soapModels.length);

		for (VcmsCategorySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vcms.model.VcmsCategory"));

	public VcmsCategoryModelImpl() {
	}

	public String getPrimaryKey() {
		return _categoryId;
	}

	public void setPrimaryKey(String primaryKey) {
		setCategoryId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _categoryId;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	public Class<?> getModelClass() {
		return VcmsCategory.class;
	}

	public String getModelClassName() {
		return VcmsCategory.class.getName();
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
		_categoryId = categoryId;
	}

	@JSON
	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
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
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public String getModifiedByUser() {
		if (_modifiedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedByUser;
		}
	}

	public void setModifiedByUser(String modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	@JSON
	public String getPortionId() {
		if (_portionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _portionId;
		}
	}

	public void setPortionId(String portionId) {
		_columnBitmask |= PORTIONID_COLUMN_BITMASK;

		if (_originalPortionId == null) {
			_originalPortionId = _portionId;
		}

		_portionId = portionId;
	}

	public String getOriginalPortionId() {
		return GetterUtil.getString(_originalPortionId);
	}

	@JSON
	public String getParentId() {
		if (_parentId == null) {
			return StringPool.BLANK;
		}
		else {
			return _parentId;
		}
	}

	public void setParentId(String parentId) {
		_columnBitmask |= PARENTID_COLUMN_BITMASK;

		if (_originalParentId == null) {
			_originalParentId = _parentId;
		}

		_parentId = parentId;
	}

	public String getOriginalParentId() {
		return GetterUtil.getString(_originalParentId);
	}

	@JSON
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	@JSON
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	public boolean getAnchored() {
		return _anchored;
	}

	public boolean isAnchored() {
		return _anchored;
	}

	public void setAnchored(boolean anchored) {
		_anchored = anchored;
	}

	@JSON
	public String getHref() {
		if (_href == null) {
			return StringPool.BLANK;
		}
		else {
			return _href;
		}
	}

	public void setHref(String href) {
		_href = href;
	}

	@JSON
	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	public void setLanguage(String language) {
		_columnBitmask |= LANGUAGE_COLUMN_BITMASK;

		if (_originalLanguage == null) {
			_originalLanguage = _language;
		}

		_language = language;
	}

	public String getOriginalLanguage() {
		return GetterUtil.getString(_originalLanguage);
	}

	@JSON
	public boolean getHasImage() {
		return _hasImage;
	}

	public boolean isHasImage() {
		return _hasImage;
	}

	public void setHasImage(boolean hasImage) {
		_hasImage = hasImage;
	}

	@JSON
	public String getImage() {
		if (_image == null) {
			return StringPool.BLANK;
		}
		else {
			return _image;
		}
	}

	public void setImage(String image) {
		_image = image;
	}

	@JSON
	public long getPosition() {
		return _position;
	}

	public void setPosition(long position) {
		_columnBitmask = -1L;

		_position = position;
	}

	@JSON
	public long getUserHit() {
		return _userHit;
	}

	public void setUserHit(long userHit) {
		_userHit = userHit;
	}

	@JSON
	public boolean getRssable() {
		return _rssable;
	}

	public boolean isRssable() {
		return _rssable;
	}

	public void setRssable(boolean rssable) {
		_rssable = rssable;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VcmsCategory toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (VcmsCategory)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		VcmsCategoryImpl vcmsCategoryImpl = new VcmsCategoryImpl();

		vcmsCategoryImpl.setCategoryId(getCategoryId());
		vcmsCategoryImpl.setGroupId(getGroupId());
		vcmsCategoryImpl.setCompanyId(getCompanyId());
		vcmsCategoryImpl.setCreatedDate(getCreatedDate());
		vcmsCategoryImpl.setCreatedByUser(getCreatedByUser());
		vcmsCategoryImpl.setModifiedDate(getModifiedDate());
		vcmsCategoryImpl.setModifiedByUser(getModifiedByUser());
		vcmsCategoryImpl.setPortionId(getPortionId());
		vcmsCategoryImpl.setParentId(getParentId());
		vcmsCategoryImpl.setName(getName());
		vcmsCategoryImpl.setDescription(getDescription());
		vcmsCategoryImpl.setAnchored(getAnchored());
		vcmsCategoryImpl.setHref(getHref());
		vcmsCategoryImpl.setLanguage(getLanguage());
		vcmsCategoryImpl.setHasImage(getHasImage());
		vcmsCategoryImpl.setImage(getImage());
		vcmsCategoryImpl.setPosition(getPosition());
		vcmsCategoryImpl.setUserHit(getUserHit());
		vcmsCategoryImpl.setRssable(getRssable());

		vcmsCategoryImpl.resetOriginalValues();

		return vcmsCategoryImpl;
	}

	public int compareTo(VcmsCategory vcmsCategory) {
		int value = 0;

		if (getPosition() < vcmsCategory.getPosition()) {
			value = -1;
		}
		else if (getPosition() > vcmsCategory.getPosition()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		VcmsCategory vcmsCategory = null;

		try {
			vcmsCategory = (VcmsCategory)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = vcmsCategory.getPrimaryKey();

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
		VcmsCategoryModelImpl vcmsCategoryModelImpl = this;

		vcmsCategoryModelImpl._originalGroupId = vcmsCategoryModelImpl._groupId;

		vcmsCategoryModelImpl._setOriginalGroupId = false;

		vcmsCategoryModelImpl._originalPortionId = vcmsCategoryModelImpl._portionId;

		vcmsCategoryModelImpl._originalParentId = vcmsCategoryModelImpl._parentId;

		vcmsCategoryModelImpl._originalLanguage = vcmsCategoryModelImpl._language;

		vcmsCategoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VcmsCategory> toCacheModel() {
		VcmsCategoryCacheModel vcmsCategoryCacheModel = new VcmsCategoryCacheModel();

		vcmsCategoryCacheModel.categoryId = getCategoryId();

		String categoryId = vcmsCategoryCacheModel.categoryId;

		if ((categoryId != null) && (categoryId.length() == 0)) {
			vcmsCategoryCacheModel.categoryId = null;
		}

		vcmsCategoryCacheModel.groupId = getGroupId();

		vcmsCategoryCacheModel.companyId = getCompanyId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vcmsCategoryCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vcmsCategoryCacheModel.createdDate = Long.MIN_VALUE;
		}

		vcmsCategoryCacheModel.createdByUser = getCreatedByUser();

		String createdByUser = vcmsCategoryCacheModel.createdByUser;

		if ((createdByUser != null) && (createdByUser.length() == 0)) {
			vcmsCategoryCacheModel.createdByUser = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vcmsCategoryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vcmsCategoryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		vcmsCategoryCacheModel.modifiedByUser = getModifiedByUser();

		String modifiedByUser = vcmsCategoryCacheModel.modifiedByUser;

		if ((modifiedByUser != null) && (modifiedByUser.length() == 0)) {
			vcmsCategoryCacheModel.modifiedByUser = null;
		}

		vcmsCategoryCacheModel.portionId = getPortionId();

		String portionId = vcmsCategoryCacheModel.portionId;

		if ((portionId != null) && (portionId.length() == 0)) {
			vcmsCategoryCacheModel.portionId = null;
		}

		vcmsCategoryCacheModel.parentId = getParentId();

		String parentId = vcmsCategoryCacheModel.parentId;

		if ((parentId != null) && (parentId.length() == 0)) {
			vcmsCategoryCacheModel.parentId = null;
		}

		vcmsCategoryCacheModel.name = getName();

		String name = vcmsCategoryCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			vcmsCategoryCacheModel.name = null;
		}

		vcmsCategoryCacheModel.description = getDescription();

		String description = vcmsCategoryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			vcmsCategoryCacheModel.description = null;
		}

		vcmsCategoryCacheModel.anchored = getAnchored();

		vcmsCategoryCacheModel.href = getHref();

		String href = vcmsCategoryCacheModel.href;

		if ((href != null) && (href.length() == 0)) {
			vcmsCategoryCacheModel.href = null;
		}

		vcmsCategoryCacheModel.language = getLanguage();

		String language = vcmsCategoryCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			vcmsCategoryCacheModel.language = null;
		}

		vcmsCategoryCacheModel.hasImage = getHasImage();

		vcmsCategoryCacheModel.image = getImage();

		String image = vcmsCategoryCacheModel.image;

		if ((image != null) && (image.length() == 0)) {
			vcmsCategoryCacheModel.image = null;
		}

		vcmsCategoryCacheModel.position = getPosition();

		vcmsCategoryCacheModel.userHit = getUserHit();

		vcmsCategoryCacheModel.rssable = getRssable();

		return vcmsCategoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{categoryId=");
		sb.append(getCategoryId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", portionId=");
		sb.append(getPortionId());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", anchored=");
		sb.append(getAnchored());
		sb.append(", href=");
		sb.append(getHref());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", hasImage=");
		sb.append(getHasImage());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", userHit=");
		sb.append(getUserHit());
		sb.append(", rssable=");
		sb.append(getRssable());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vcms.model.VcmsCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
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
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portionId</column-name><column-value><![CDATA[");
		sb.append(getPortionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>anchored</column-name><column-value><![CDATA[");
		sb.append(getAnchored());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>href</column-name><column-value><![CDATA[");
		sb.append(getHref());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hasImage</column-name><column-value><![CDATA[");
		sb.append(getHasImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userHit</column-name><column-value><![CDATA[");
		sb.append(getUserHit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rssable</column-name><column-value><![CDATA[");
		sb.append(getRssable());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VcmsCategory.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			VcmsCategory.class
		};
	private String _categoryId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private Date _createdDate;
	private String _createdByUser;
	private Date _modifiedDate;
	private String _modifiedByUser;
	private String _portionId;
	private String _originalPortionId;
	private String _parentId;
	private String _originalParentId;
	private String _name;
	private String _description;
	private boolean _anchored;
	private String _href;
	private String _language;
	private String _originalLanguage;
	private boolean _hasImage;
	private String _image;
	private long _position;
	private long _userHit;
	private boolean _rssable;
	private long _columnBitmask;
	private VcmsCategory _escapedModelProxy;
}