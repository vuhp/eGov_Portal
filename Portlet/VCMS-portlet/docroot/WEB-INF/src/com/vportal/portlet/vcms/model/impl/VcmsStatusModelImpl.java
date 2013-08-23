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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vportal.portlet.vcms.model.VcmsStatus;
import com.vportal.portlet.vcms.model.VcmsStatusModel;
import com.vportal.portlet.vcms.model.VcmsStatusSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VcmsStatus service. Represents a row in the &quot;VcmsStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vcms.model.VcmsStatusModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsStatusImpl}.
 * </p>
 *
 * @author hai
 * @see VcmsStatusImpl
 * @see com.vportal.portlet.vcms.model.VcmsStatus
 * @see com.vportal.portlet.vcms.model.VcmsStatusModel
 * @generated
 */
@JSON(strict = true)
public class VcmsStatusModelImpl extends BaseModelImpl<VcmsStatus>
	implements VcmsStatusModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vcms status model instance should use the {@link com.vportal.portlet.vcms.model.VcmsStatus} interface instead.
	 */
	public static final String TABLE_NAME = "VcmsStatus";
	public static final Object[][] TABLE_COLUMNS = {
			{ "statusId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdByUser", Types.VARCHAR },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "modifiedByUser", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "cssClass", Types.VARCHAR },
			{ "textColor", Types.VARCHAR },
			{ "position", Types.BIGINT },
			{ "isPrimary", Types.BOOLEAN },
			{ "active_", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table VcmsStatus (statusId LONG not null primary key,companyId LONG,groupId LONG,createdDate DATE null,createdByUser VARCHAR(75) null,modifiedDate DATE null,modifiedByUser VARCHAR(75) null,name VARCHAR(500) null,description VARCHAR(1000) null,cssClass VARCHAR(75) null,textColor VARCHAR(75) null,position LONG,isPrimary BOOLEAN,active_ BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table VcmsStatus";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsStatus.position ASC, vcmsStatus.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsStatus.position ASC, VcmsStatus.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vcms.model.VcmsStatus"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vcms.model.VcmsStatus"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.vportal.portlet.vcms.model.VcmsStatus"),
			true);
	public static long ACTIVE_COLUMN_BITMASK = 1L;
	public static long COMPANYID_COLUMN_BITMASK = 2L;
	public static long GROUPID_COLUMN_BITMASK = 4L;
	public static long ISPRIMARY_COLUMN_BITMASK = 8L;
	public static long POSITION_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VcmsStatus toModel(VcmsStatusSoap soapModel) {
		VcmsStatus model = new VcmsStatusImpl();

		model.setStatusId(soapModel.getStatusId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setCreatedByUser(soapModel.getCreatedByUser());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setModifiedByUser(soapModel.getModifiedByUser());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setCssClass(soapModel.getCssClass());
		model.setTextColor(soapModel.getTextColor());
		model.setPosition(soapModel.getPosition());
		model.setIsPrimary(soapModel.getIsPrimary());
		model.setActive(soapModel.getActive());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VcmsStatus> toModels(VcmsStatusSoap[] soapModels) {
		List<VcmsStatus> models = new ArrayList<VcmsStatus>(soapModels.length);

		for (VcmsStatusSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vcms.model.VcmsStatus"));

	public VcmsStatusModelImpl() {
	}

	public long getPrimaryKey() {
		return _statusId;
	}

	public void setPrimaryKey(long primaryKey) {
		setStatusId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_statusId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return VcmsStatus.class;
	}

	public String getModelClassName() {
		return VcmsStatus.class.getName();
	}

	@JSON
	public long getStatusId() {
		return _statusId;
	}

	public void setStatusId(long statusId) {
		_statusId = statusId;
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
	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_columnBitmask = -1L;

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
	public String getCssClass() {
		if (_cssClass == null) {
			return StringPool.BLANK;
		}
		else {
			return _cssClass;
		}
	}

	public void setCssClass(String cssClass) {
		_cssClass = cssClass;
	}

	@JSON
	public String getTextColor() {
		if (_textColor == null) {
			return StringPool.BLANK;
		}
		else {
			return _textColor;
		}
	}

	public void setTextColor(String textColor) {
		_textColor = textColor;
	}

	@JSON
	public long getPosition() {
		return _position;
	}

	public void setPosition(long position) {
		_columnBitmask = -1L;

		if (!_setOriginalPosition) {
			_setOriginalPosition = true;

			_originalPosition = _position;
		}

		_position = position;
	}

	public long getOriginalPosition() {
		return _originalPosition;
	}

	@JSON
	public boolean getIsPrimary() {
		return _isPrimary;
	}

	public boolean isIsPrimary() {
		return _isPrimary;
	}

	public void setIsPrimary(boolean isPrimary) {
		_columnBitmask |= ISPRIMARY_COLUMN_BITMASK;

		if (!_setOriginalIsPrimary) {
			_setOriginalIsPrimary = true;

			_originalIsPrimary = _isPrimary;
		}

		_isPrimary = isPrimary;
	}

	public boolean getOriginalIsPrimary() {
		return _originalIsPrimary;
	}

	@JSON
	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_columnBitmask |= ACTIVE_COLUMN_BITMASK;

		if (!_setOriginalActive) {
			_setOriginalActive = true;

			_originalActive = _active;
		}

		_active = active;
	}

	public boolean getOriginalActive() {
		return _originalActive;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VcmsStatus toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (VcmsStatus)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					VcmsStatus.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		VcmsStatusImpl vcmsStatusImpl = new VcmsStatusImpl();

		vcmsStatusImpl.setStatusId(getStatusId());
		vcmsStatusImpl.setCompanyId(getCompanyId());
		vcmsStatusImpl.setGroupId(getGroupId());
		vcmsStatusImpl.setCreatedDate(getCreatedDate());
		vcmsStatusImpl.setCreatedByUser(getCreatedByUser());
		vcmsStatusImpl.setModifiedDate(getModifiedDate());
		vcmsStatusImpl.setModifiedByUser(getModifiedByUser());
		vcmsStatusImpl.setName(getName());
		vcmsStatusImpl.setDescription(getDescription());
		vcmsStatusImpl.setCssClass(getCssClass());
		vcmsStatusImpl.setTextColor(getTextColor());
		vcmsStatusImpl.setPosition(getPosition());
		vcmsStatusImpl.setIsPrimary(getIsPrimary());
		vcmsStatusImpl.setActive(getActive());

		vcmsStatusImpl.resetOriginalValues();

		return vcmsStatusImpl;
	}

	public int compareTo(VcmsStatus vcmsStatus) {
		int value = 0;

		if (getPosition() < vcmsStatus.getPosition()) {
			value = -1;
		}
		else if (getPosition() > vcmsStatus.getPosition()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = DateUtil.compareTo(getCreatedDate(), vcmsStatus.getCreatedDate());

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

		VcmsStatus vcmsStatus = null;

		try {
			vcmsStatus = (VcmsStatus)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = vcmsStatus.getPrimaryKey();

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
		VcmsStatusModelImpl vcmsStatusModelImpl = this;

		vcmsStatusModelImpl._originalCompanyId = vcmsStatusModelImpl._companyId;

		vcmsStatusModelImpl._setOriginalCompanyId = false;

		vcmsStatusModelImpl._originalGroupId = vcmsStatusModelImpl._groupId;

		vcmsStatusModelImpl._setOriginalGroupId = false;

		vcmsStatusModelImpl._originalPosition = vcmsStatusModelImpl._position;

		vcmsStatusModelImpl._setOriginalPosition = false;

		vcmsStatusModelImpl._originalIsPrimary = vcmsStatusModelImpl._isPrimary;

		vcmsStatusModelImpl._setOriginalIsPrimary = false;

		vcmsStatusModelImpl._originalActive = vcmsStatusModelImpl._active;

		vcmsStatusModelImpl._setOriginalActive = false;

		vcmsStatusModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VcmsStatus> toCacheModel() {
		VcmsStatusCacheModel vcmsStatusCacheModel = new VcmsStatusCacheModel();

		vcmsStatusCacheModel.statusId = getStatusId();

		vcmsStatusCacheModel.companyId = getCompanyId();

		vcmsStatusCacheModel.groupId = getGroupId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vcmsStatusCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vcmsStatusCacheModel.createdDate = Long.MIN_VALUE;
		}

		vcmsStatusCacheModel.createdByUser = getCreatedByUser();

		String createdByUser = vcmsStatusCacheModel.createdByUser;

		if ((createdByUser != null) && (createdByUser.length() == 0)) {
			vcmsStatusCacheModel.createdByUser = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vcmsStatusCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vcmsStatusCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		vcmsStatusCacheModel.modifiedByUser = getModifiedByUser();

		String modifiedByUser = vcmsStatusCacheModel.modifiedByUser;

		if ((modifiedByUser != null) && (modifiedByUser.length() == 0)) {
			vcmsStatusCacheModel.modifiedByUser = null;
		}

		vcmsStatusCacheModel.name = getName();

		String name = vcmsStatusCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			vcmsStatusCacheModel.name = null;
		}

		vcmsStatusCacheModel.description = getDescription();

		String description = vcmsStatusCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			vcmsStatusCacheModel.description = null;
		}

		vcmsStatusCacheModel.cssClass = getCssClass();

		String cssClass = vcmsStatusCacheModel.cssClass;

		if ((cssClass != null) && (cssClass.length() == 0)) {
			vcmsStatusCacheModel.cssClass = null;
		}

		vcmsStatusCacheModel.textColor = getTextColor();

		String textColor = vcmsStatusCacheModel.textColor;

		if ((textColor != null) && (textColor.length() == 0)) {
			vcmsStatusCacheModel.textColor = null;
		}

		vcmsStatusCacheModel.position = getPosition();

		vcmsStatusCacheModel.isPrimary = getIsPrimary();

		vcmsStatusCacheModel.active = getActive();

		return vcmsStatusCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{statusId=");
		sb.append(getStatusId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", cssClass=");
		sb.append(getCssClass());
		sb.append(", textColor=");
		sb.append(getTextColor());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", isPrimary=");
		sb.append(getIsPrimary());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vcms.model.VcmsStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
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
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cssClass</column-name><column-value><![CDATA[");
		sb.append(getCssClass());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>textColor</column-name><column-value><![CDATA[");
		sb.append(getTextColor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isPrimary</column-name><column-value><![CDATA[");
		sb.append(getIsPrimary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VcmsStatus.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			VcmsStatus.class
		};
	private long _statusId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createdDate;
	private String _createdByUser;
	private Date _modifiedDate;
	private String _modifiedByUser;
	private String _name;
	private String _description;
	private String _cssClass;
	private String _textColor;
	private long _position;
	private long _originalPosition;
	private boolean _setOriginalPosition;
	private boolean _isPrimary;
	private boolean _originalIsPrimary;
	private boolean _setOriginalIsPrimary;
	private boolean _active;
	private boolean _originalActive;
	private boolean _setOriginalActive;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private VcmsStatus _escapedModelProxy;
}