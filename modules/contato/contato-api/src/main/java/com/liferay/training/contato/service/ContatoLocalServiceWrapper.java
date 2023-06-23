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

package com.liferay.training.contato.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContatoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContatoLocalService
 * @generated
 */
public class ContatoLocalServiceWrapper
	implements ContatoLocalService, ServiceWrapper<ContatoLocalService> {

	public ContatoLocalServiceWrapper(ContatoLocalService contatoLocalService) {
		_contatoLocalService = contatoLocalService;
	}

	/**
	 * Adds the contato to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContatoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contato the contato
	 * @return the contato that was added
	 */
	@Override
	public com.liferay.training.contato.model.Contato addContato(
		com.liferay.training.contato.model.Contato contato) {

		return _contatoLocalService.addContato(contato);
	}

	@Override
	public com.liferay.training.contato.model.Contato addContato(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.addContato(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	@Override
	public boolean checkIfEmailExists(String email) {
		return _contatoLocalService.checkIfEmailExists(email);
	}

	/**
	 * Creates a new contato with the primary key. Does not add the contato to the database.
	 *
	 * @param contatoId the primary key for the new contato
	 * @return the new contato
	 */
	@Override
	public com.liferay.training.contato.model.Contato createContato(
		long contatoId) {

		return _contatoLocalService.createContato(contatoId);
	}

	/**
	 * Deletes the contato from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContatoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contato the contato
	 * @return the contato that was removed
	 */
	@Override
	public com.liferay.training.contato.model.Contato deleteContato(
		com.liferay.training.contato.model.Contato contato) {

		return _contatoLocalService.deleteContato(contato);
	}

	/**
	 * Deletes the contato with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContatoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato that was removed
	 * @throws PortalException if a contato with the primary key could not be found
	 */
	@Override
	public com.liferay.training.contato.model.Contato deleteContato(
			long contatoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.deleteContato(contatoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _contatoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contatoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.contato.model.impl.ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _contatoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.contato.model.impl.ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _contatoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _contatoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _contatoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.training.contato.model.Contato fetchContato(
		long contatoId) {

		return _contatoLocalService.fetchContato(contatoId);
	}

	/**
	 * Returns the contato matching the UUID and group.
	 *
	 * @param uuid the contato's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contato, or <code>null</code> if a matching contato could not be found
	 */
	@Override
	public com.liferay.training.contato.model.Contato
		fetchContatoByUuidAndGroupId(String uuid, long groupId) {

		return _contatoLocalService.fetchContatoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _contatoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the contato with the primary key.
	 *
	 * @param contatoId the primary key of the contato
	 * @return the contato
	 * @throws PortalException if a contato with the primary key could not be found
	 */
	@Override
	public com.liferay.training.contato.model.Contato getContato(long contatoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.getContato(contatoId);
	}

	@Override
	public com.liferay.training.contato.model.Contato getContatoById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.getContatoById(id);
	}

	/**
	 * Returns the contato matching the UUID and group.
	 *
	 * @param uuid the contato's UUID
	 * @param groupId the primary key of the group
	 * @return the matching contato
	 * @throws PortalException if a matching contato could not be found
	 */
	@Override
	public com.liferay.training.contato.model.Contato
			getContatoByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.getContatoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the contatos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.training.contato.model.impl.ContatoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @return the range of contatos
	 */
	@Override
	public java.util.List<com.liferay.training.contato.model.Contato>
		getContatos(int start, int end) {

		return _contatoLocalService.getContatos(start, end);
	}

	@Override
	public java.util.List<com.liferay.training.contato.model.Contato>
		getContatosByGroupId(long groupId) {

		return _contatoLocalService.getContatosByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.training.contato.model.Contato>
			getContatosByUser(
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.getContatosByUser(serviceContext);
	}

	/**
	 * Returns all the contatos matching the UUID and company.
	 *
	 * @param uuid the UUID of the contatos
	 * @param companyId the primary key of the company
	 * @return the matching contatos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.contato.model.Contato>
		getContatosByUuidAndCompanyId(String uuid, long companyId) {

		return _contatoLocalService.getContatosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of contatos matching the UUID and company.
	 *
	 * @param uuid the UUID of the contatos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of contatos
	 * @param end the upper bound of the range of contatos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching contatos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.training.contato.model.Contato>
		getContatosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.training.contato.model.Contato>
					orderByComparator) {

		return _contatoLocalService.getContatosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of contatos.
	 *
	 * @return the number of contatos
	 */
	@Override
	public int getContatosCount() {
		return _contatoLocalService.getContatosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _contatoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _contatoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contatoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the contato in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ContatoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param contato the contato
	 * @return the contato that was updated
	 */
	@Override
	public com.liferay.training.contato.model.Contato updateContato(
		com.liferay.training.contato.model.Contato contato) {

		return _contatoLocalService.updateContato(contato);
	}

	@Override
	public com.liferay.training.contato.model.Contato updateContato(
			long contatoId, String nome, String telefone, String email,
			int idade)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoLocalService.updateContato(
			contatoId, nome, telefone, email, idade);
	}

	@Override
	public ContatoLocalService getWrappedService() {
		return _contatoLocalService;
	}

	@Override
	public void setWrappedService(ContatoLocalService contatoLocalService) {
		_contatoLocalService = contatoLocalService;
	}

	private ContatoLocalService _contatoLocalService;

}