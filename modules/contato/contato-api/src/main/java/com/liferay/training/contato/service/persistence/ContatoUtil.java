/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.training.contato.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.contato.model.Contato;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the contato service. This utility wraps <code>com.liferay.training.contato.service.persistence.impl.ContatoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContatoPersistence
 * @generated
 */
public class ContatoUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Contato contato) {
		getPersistence().clearCache(contato);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Contato> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Contato> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Contato> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Contato> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Contato> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Contato update(Contato contato) {
		return getPersistence().update(contato);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Contato update(
		Contato contato, ServiceContext serviceContext) {

		return getPersistence().update(contato, serviceContext);
	}

	/**
	 * Returns all the contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contatos
	 */
	public static List<Contato> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the contatos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @return the range of matching contatos
	 */
	public static List<Contato> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the contatos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contatos
	 */
	public static List<Contato> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contato> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contatos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contatos
	 */
	public static List<Contato> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Contato> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findByUuid_First(
			String uuid, OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByUuid_First(
		String uuid, OrderByComparator<Contato> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findByUuid_Last(
			String uuid, OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByUuid_Last(
		String uuid, OrderByComparator<Contato> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the contatos before and after the current contato in the ordered set where uuid = &#63;.
	 *
	 * @param contatoId the primary key of the current contato
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contato
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public static Contato[] findByUuid_PrevAndNext(
			long contatoId, String uuid,
			OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByUuid_PrevAndNext(
			contatoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the contatos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contatos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the contato where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContatoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findByUUID_G(String uuid, long groupId)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the contato where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contato that was removed
	 */
	public static Contato removeByUUID_G(String uuid, long groupId)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of contatos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contatos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contatos
	 */
	public static List<Contato> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @return the range of matching contatos
	 */
	public static List<Contato> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contatos
	 */
	public static List<Contato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contato> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contatos
	 */
	public static List<Contato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Contato> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Contato> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Contato> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the contatos before and after the current contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param contatoId the primary key of the current contato
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contato
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public static Contato[] findByUuid_C_PrevAndNext(
			long contatoId, String uuid, long companyId,
			OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			contatoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the contatos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contatos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contatos
	 */
	public static List<Contato> findBygroupId(long groupId) {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	 * Returns a range of all the contatos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @return the range of matching contatos
	 */
	public static List<Contato> findBygroupId(
		long groupId, int start, int end) {

		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the contatos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching contatos
	 */
	public static List<Contato> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Contato> orderByComparator) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contatos where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching contatos
	 */
	public static List<Contato> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Contato> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findBygroupId_First(
			long groupId, OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchBygroupId_First(
		long groupId, OrderByComparator<Contato> orderByComparator) {

		return getPersistence().fetchBygroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findBygroupId_Last(
			long groupId, OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchBygroupId_Last(
		long groupId, OrderByComparator<Contato> orderByComparator) {

		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the contatos before and after the current contato in the ordered set where groupId = &#63;.
	 *
	 * @param contatoId the primary key of the current contato
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contato
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public static Contato[] findBygroupId_PrevAndNext(
			long contatoId, long groupId,
			OrderByComparator<Contato> orderByComparator)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findBygroupId_PrevAndNext(
			contatoId, groupId, orderByComparator);
	}

	/**
	 * Removes all the contatos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeBygroupId(long groupId) {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	 * Returns the number of contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contatos
	 */
	public static int countBygroupId(long groupId) {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	 * Returns the contato where email = &#63; or throws a <code>NoSuchContatoException</code> if it could not be found.
	 *
	 * @param email the email
	 * @return the matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public static Contato findByfindByEmailAddress(String email)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByfindByEmailAddress(email);
	}

	/**
	 * Returns the contato where email = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param email the email
	 * @return the matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByfindByEmailAddress(String email) {
		return getPersistence().fetchByfindByEmailAddress(email);
	}

	/**
	 * Returns the contato where email = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param email the email
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public static Contato fetchByfindByEmailAddress(
		String email, boolean useFinderCache) {

		return getPersistence().fetchByfindByEmailAddress(
			email, useFinderCache);
	}

	/**
	 * Removes the contato where email = &#63; from the database.
	 *
	 * @param email the email
	 * @return the contato that was removed
	 */
	public static Contato removeByfindByEmailAddress(String email)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().removeByfindByEmailAddress(email);
	}

	/**
	 * Returns the number of contatos where email = &#63;.
	 *
	 * @param email the email
	 * @return the number of matching contatos
	 */
	public static int countByfindByEmailAddress(String email) {
		return getPersistence().countByfindByEmailAddress(email);
	}

	/**
	 * Caches the contato in the entity cache if it is enabled.
	 *
	 * @param contato the contato
	 */
	public static void cacheResult(Contato contato) {
		getPersistence().cacheResult(contato);
	}

	/**
	 * Caches the contatos in the entity cache if it is enabled.
	 *
	 * @param contatos the contatos
	 */
	public static void cacheResult(List<Contato> contatos) {
		getPersistence().cacheResult(contatos);
	}

	/**
	 * Creates a new contato with the primary key. Does not add the contato to the database.
	 *
	 * @param contatoId the primary key for the new contato
	 * @return the new contato
	 */
	public static Contato create(long contatoId) {
		return getPersistence().create(contatoId);
	}

	/**
	 * Removes the contato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato that was removed
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public static Contato remove(long contatoId)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().remove(contatoId);
	}

	public static Contato updateImpl(Contato contato) {
		return getPersistence().updateImpl(contato);
	}

	/**
	 * Returns the contato with the primary key or throws a <code>NoSuchContatoException</code> if it could not be found.
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public static Contato findByPrimaryKey(long contatoId)
		throws com.liferay.training.contato.exception.NoSuchContatoException {

		return getPersistence().findByPrimaryKey(contatoId);
	}

	/**
	 * Returns the contato with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato, or <code>null</code> if a contato with the primary key could not be found
	 */
	public static Contato fetchByPrimaryKey(long contatoId) {
		return getPersistence().fetchByPrimaryKey(contatoId);
	}

	/**
	 * Returns all the contatos.
	 *
	 * @return the contatos
	 */
	public static List<Contato> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @return the range of contatos
	 */
	public static List<Contato> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of contatos
	 */
	public static List<Contato> findAll(
		int start, int end, OrderByComparator<Contato> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of contatos
	 */
	public static List<Contato> findAll(
		int start, int end, OrderByComparator<Contato> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the contatos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of contatos.
	 *
	 * @return the number of contatos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ContatoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ContatoPersistence _persistence;

}