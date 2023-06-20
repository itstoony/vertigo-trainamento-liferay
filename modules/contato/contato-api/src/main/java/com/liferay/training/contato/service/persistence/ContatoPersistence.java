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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.training.contato.exception.NoSuchContatoException;
import com.liferay.training.contato.model.Contato;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the contato service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContatoUtil
 * @generated
 */
@ProviderType
public interface ContatoPersistence extends BasePersistence<Contato> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContatoUtil} to access the contato persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching contatos
	 */
	public java.util.List<Contato> findByUuid(String uuid);

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
	public java.util.List<Contato> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Contato> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

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
	public java.util.List<Contato> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public Contato findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Returns the first contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

	/**
	 * Returns the last contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public Contato findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Returns the last contato in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

	/**
	 * Returns the contatos before and after the current contato in the ordered set where uuid = &#63;.
	 *
	 * @param contatoId the primary key of the current contato
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contato
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public Contato[] findByUuid_PrevAndNext(
			long contatoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Removes all the contatos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of contatos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching contatos
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the contato where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchContatoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public Contato findByUUID_G(String uuid, long groupId)
		throws NoSuchContatoException;

	/**
	 * Returns the contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the contato where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the contato where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the contato that was removed
	 */
	public Contato removeByUUID_G(String uuid, long groupId)
		throws NoSuchContatoException;

	/**
	 * Returns the number of contatos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching contatos
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching contatos
	 */
	public java.util.List<Contato> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Contato> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Contato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

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
	public java.util.List<Contato> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public Contato findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Returns the first contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

	/**
	 * Returns the last contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public Contato findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Returns the last contato in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

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
	public Contato[] findByUuid_C_PrevAndNext(
			long contatoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Removes all the contatos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of contatos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching contatos
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching contatos
	 */
	public java.util.List<Contato> findBygroupId(long groupId);

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
	public java.util.List<Contato> findBygroupId(
		long groupId, int start, int end);

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
	public java.util.List<Contato> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

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
	public java.util.List<Contato> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public Contato findBygroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Returns the first contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

	/**
	 * Returns the last contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato
	 * @throws NoSuchContatoException if a matching contato could not be found
	 */
	public Contato findBygroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Returns the last contato in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching contato, or <code>null</code> if a matching contato could not be found
	 */
	public Contato fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

	/**
	 * Returns the contatos before and after the current contato in the ordered set where groupId = &#63;.
	 *
	 * @param contatoId the primary key of the current contato
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next contato
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public Contato[] findBygroupId_PrevAndNext(
			long contatoId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Contato>
				orderByComparator)
		throws NoSuchContatoException;

	/**
	 * Removes all the contatos where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeBygroupId(long groupId);

	/**
	 * Returns the number of contatos where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching contatos
	 */
	public int countBygroupId(long groupId);

	/**
	 * Caches the contato in the entity cache if it is enabled.
	 *
	 * @param contato the contato
	 */
	public void cacheResult(Contato contato);

	/**
	 * Caches the contatos in the entity cache if it is enabled.
	 *
	 * @param contatos the contatos
	 */
	public void cacheResult(java.util.List<Contato> contatos);

	/**
	 * Creates a new contato with the primary key. Does not add the contato to the database.
	 *
	 * @param contatoId the primary key for the new contato
	 * @return the new contato
	 */
	public Contato create(long contatoId);

	/**
	 * Removes the contato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato that was removed
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public Contato remove(long contatoId) throws NoSuchContatoException;

	public Contato updateImpl(Contato contato);

	/**
	 * Returns the contato with the primary key or throws a <code>NoSuchContatoException</code> if it could not be found.
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato
	 * @throws NoSuchContatoException if a contato with the primary key could not be found
	 */
	public Contato findByPrimaryKey(long contatoId)
		throws NoSuchContatoException;

	/**
	 * Returns the contato with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato, or <code>null</code> if a contato with the primary key could not be found
	 */
	public Contato fetchByPrimaryKey(long contatoId);

	/**
	 * Returns all the contatos.
	 *
	 * @return the contatos
	 */
	public java.util.List<Contato> findAll();

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
	public java.util.List<Contato> findAll(int start, int end);

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
	public java.util.List<Contato> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator);

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
	public java.util.List<Contato> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Contato>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the contatos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of contatos.
	 *
	 * @return the number of contatos
	 */
	public int countAll();

}