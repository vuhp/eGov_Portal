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

package com.vportal.portlet.vimagegallery.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vportal.portlet.vimagegallery.model.TFImage;
import com.vportal.portlet.vimagegallery.model.TFImageModel;
import com.vportal.portlet.vimagegallery.model.TFImageSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the TFImage service. Represents a row in the &quot;TFImage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vimagegallery.model.TFImageModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TFImageImpl}.
 * </p>
 *
 * @author DucNN
 * @see TFImageImpl
 * @see com.vportal.portlet.vimagegallery.model.TFImage
 * @see com.vportal.portlet.vimagegallery.model.TFImageModel
 * @generated
 */
@JSON(strict = true)
public class TFImageModelImpl extends BaseModelImpl<TFImage>
	implements TFImageModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t f image model instance should use the {@link com.vportal.portlet.vimagegallery.model.TFImage} interface instead.
	 */
	public static final String TABLE_NAME = "TFImage";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "categoryId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "image", Types.VARCHAR },
			{ "isShow", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table TFImage (id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,categoryId LONG,name VARCHAR(500) null,description VARCHAR(1000) null,image VARCHAR(300) null,isShow BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table TFImage";
	public static final String ORDER_BY_JPQL = " ORDER BY tfImage.createDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY TFImage.createDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vimagegallery.model.TFImage"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vimagegallery.model.TFImage"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.vportal.portlet.vimagegallery.model.TFImage"),
			true);
	public static long CATEGORYID_COLUMN_BITMASK = 1L;
	public static long COMPANYID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static long ISSHOW_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TFImage toModel(TFImageSoap soapModel) {
		TFImage model = new TFImageImpl();

		model.setId(soapModel.getId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCategoryId(soapModel.getCategoryId());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setImage(soapModel.getImage());
		model.setIsShow(soapModel.getIsShow());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TFImage> toModels(TFImageSoap[] soapModels) {
		List<TFImage> models = new ArrayList<TFImage>(soapModels.length);

		for (TFImageSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vimagegallery.model.TFImage"));

	public TFImageModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return TFImage.class;
	}

	public String getModelClassName() {
		return TFImage.class.getName();
	}

	@JSON
	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_columnBitmask = -1L;

		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public long getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(long categoryId) {
		_columnBitmask |= CATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalCategoryId) {
			_setOriginalCategoryId = true;

			_originalCategoryId = _categoryId;
		}

		_categoryId = categoryId;
	}

	public long getOriginalCategoryId() {
		return _originalCategoryId;
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
	public boolean getIsShow() {
		return _isShow;
	}

	public boolean isIsShow() {
		return _isShow;
	}

	public void setIsShow(boolean isShow) {
		_columnBitmask |= ISSHOW_COLUMN_BITMASK;

		if (!_setOriginalIsShow) {
			_setOriginalIsShow = true;

			_originalIsShow = _isShow;
		}

		_isShow = isShow;
	}

	public boolean getOriginalIsShow() {
		return _originalIsShow;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public TFImage toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (TFImage)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					TFImage.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		TFImageImpl tfImageImpl = new TFImageImpl();

		tfImageImpl.setId(getId());
		tfImageImpl.setGroupId(getGroupId());
		tfImageImpl.setCompanyId(getCompanyId());
		tfImageImpl.setUserId(getUserId());
		tfImageImpl.setCreateDate(getCreateDate());
		tfImageImpl.setModifiedDate(getModifiedDate());
		tfImageImpl.setCategoryId(getCategoryId());
		tfImageImpl.setName(getName());
		tfImageImpl.setDescription(getDescription());
		tfImageImpl.setImage(getImage());
		tfImageImpl.setIsShow(getIsShow());

		tfImageImpl.resetOriginalValues();

		return tfImageImpl;
	}

	public int compareTo(TFImage tfImage) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), tfImage.getCreateDate());

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

		TFImage tfImage = null;

		try {
			tfImage = (TFImage)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = tfImage.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TFImageModelImpl tfImageModelImpl = this;

		tfImageModelImpl._originalGroupId = tfImageModelImpl._groupId;

		tfImageModelImpl._setOriginalGroupId = false;

		tfImageModelImpl._originalCompanyId = tfImageModelImpl._companyId;

		tfImageModelImpl._setOriginalCompanyId = false;

		tfImageModelImpl._originalCategoryId = tfImageModelImpl._categoryId;

		tfImageModelImpl._setOriginalCategoryId = false;

		tfImageModelImpl._originalIsShow = tfImageModelImpl._isShow;

		tfImageModelImpl._setOriginalIsShow = false;

		tfImageModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TFImage> toCacheModel() {
		TFImageCacheModel tfImageCacheModel = new TFImageCacheModel();

		tfImageCacheModel.id = getId();

		tfImageCacheModel.groupId = getGroupId();

		tfImageCacheModel.companyId = getCompanyId();

		tfImageCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			tfImageCacheModel.createDate = createDate.getTime();
		}
		else {
			tfImageCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tfImageCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			tfImageCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tfImageCacheModel.categoryId = getCategoryId();

		tfImageCacheModel.name = getName();

		String name = tfImageCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			tfImageCacheModel.name = null;
		}

		tfImageCacheModel.description = getDescription();

		String description = tfImageCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			tfImageCacheModel.description = null;
		}

		tfImageCacheModel.image = getImage();

		String image = tfImageCacheModel.image;

		if ((image != null) && (image.length() == 0)) {
			tfImageCacheModel.image = null;
		}

		tfImageCacheModel.isShow = getIsShow();

		return tfImageCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", isShow=");
		sb.append(getIsShow());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vimagegallery.model.TFImage");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
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
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isShow</column-name><column-value><![CDATA[");
		sb.append(getIsShow());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TFImage.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			TFImage.class
		};
	private long _id;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _categoryId;
	private long _originalCategoryId;
	private boolean _setOriginalCategoryId;
	private String _name;
	private String _description;
	private String _image;
	private boolean _isShow;
	private boolean _originalIsShow;
	private boolean _setOriginalIsShow;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private TFImage _escapedModelProxy;
}