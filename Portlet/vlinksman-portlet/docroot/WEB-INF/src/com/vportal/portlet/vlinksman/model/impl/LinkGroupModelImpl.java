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

package com.vportal.portlet.vlinksman.model.impl;

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

import com.vportal.portlet.vlinksman.model.LinkGroup;
import com.vportal.portlet.vlinksman.model.LinkGroupModel;
import com.vportal.portlet.vlinksman.model.LinkGroupSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the LinkGroup service. Represents a row in the &quot;LinkGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vportal.portlet.vlinksman.model.LinkGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LinkGroupImpl}.
 * </p>
 *
 * @author LongLH
 * @see LinkGroupImpl
 * @see com.vportal.portlet.vlinksman.model.LinkGroup
 * @see com.vportal.portlet.vlinksman.model.LinkGroupModel
 * @generated
 */
@JSON(strict = true)
public class LinkGroupModelImpl extends BaseModelImpl<LinkGroup>
	implements LinkGroupModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a link group model instance should use the {@link com.vportal.portlet.vlinksman.model.LinkGroup} interface instead.
	 */
	public static final String TABLE_NAME = "LinkGroup";
	public static final Object[][] TABLE_COLUMNS = {
			{ "linkgroupId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table LinkGroup (linkgroupId LONG not null primary key,groupId LONG,companyId LONG,createdDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,description VARCHAR(250) null)";
	public static final String TABLE_SQL_DROP = "drop table LinkGroup";
	public static final String ORDER_BY_JPQL = " ORDER BY linkGroup.createdDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY LinkGroup.createdDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vportal.portlet.vlinksman.model.LinkGroup"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vportal.portlet.vlinksman.model.LinkGroup"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.vportal.portlet.vlinksman.model.LinkGroup"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static LinkGroup toModel(LinkGroupSoap soapModel) {
		LinkGroup model = new LinkGroupImpl();

		model.setLinkgroupId(soapModel.getLinkgroupId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LinkGroup> toModels(LinkGroupSoap[] soapModels) {
		List<LinkGroup> models = new ArrayList<LinkGroup>(soapModels.length);

		for (LinkGroupSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vportal.portlet.vlinksman.model.LinkGroup"));

	public LinkGroupModelImpl() {
	}

	public long getPrimaryKey() {
		return _linkgroupId;
	}

	public void setPrimaryKey(long primaryKey) {
		setLinkgroupId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_linkgroupId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return LinkGroup.class;
	}

	public String getModelClassName() {
		return LinkGroup.class.getName();
	}

	@JSON
	public long getLinkgroupId() {
		return _linkgroupId;
	}

	public void setLinkgroupId(long linkgroupId) {
		_linkgroupId = linkgroupId;
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
		_columnBitmask = -1L;

		_createdDate = createdDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public LinkGroup toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (LinkGroup)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					LinkGroup.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		LinkGroupImpl linkGroupImpl = new LinkGroupImpl();

		linkGroupImpl.setLinkgroupId(getLinkgroupId());
		linkGroupImpl.setGroupId(getGroupId());
		linkGroupImpl.setCompanyId(getCompanyId());
		linkGroupImpl.setCreatedDate(getCreatedDate());
		linkGroupImpl.setModifiedDate(getModifiedDate());
		linkGroupImpl.setName(getName());
		linkGroupImpl.setDescription(getDescription());

		linkGroupImpl.resetOriginalValues();

		return linkGroupImpl;
	}

	public int compareTo(LinkGroup linkGroup) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(), linkGroup.getCreatedDate());

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

		LinkGroup linkGroup = null;

		try {
			linkGroup = (LinkGroup)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = linkGroup.getPrimaryKey();

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
		LinkGroupModelImpl linkGroupModelImpl = this;

		linkGroupModelImpl._originalGroupId = linkGroupModelImpl._groupId;

		linkGroupModelImpl._setOriginalGroupId = false;

		linkGroupModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LinkGroup> toCacheModel() {
		LinkGroupCacheModel linkGroupCacheModel = new LinkGroupCacheModel();

		linkGroupCacheModel.linkgroupId = getLinkgroupId();

		linkGroupCacheModel.groupId = getGroupId();

		linkGroupCacheModel.companyId = getCompanyId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			linkGroupCacheModel.createdDate = createdDate.getTime();
		}
		else {
			linkGroupCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			linkGroupCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			linkGroupCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		linkGroupCacheModel.name = getName();

		String name = linkGroupCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			linkGroupCacheModel.name = null;
		}

		linkGroupCacheModel.description = getDescription();

		String description = linkGroupCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			linkGroupCacheModel.description = null;
		}

		return linkGroupCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{linkgroupId=");
		sb.append(getLinkgroupId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.vportal.portlet.vlinksman.model.LinkGroup");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>linkgroupId</column-name><column-value><![CDATA[");
		sb.append(getLinkgroupId());
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
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LinkGroup.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			LinkGroup.class
		};
	private long _linkgroupId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private LinkGroup _escapedModelProxy;
}