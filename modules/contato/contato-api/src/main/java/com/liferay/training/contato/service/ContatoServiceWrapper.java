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
 * Provides a wrapper for {@link ContatoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContatoService
 * @generated
 */
public class ContatoServiceWrapper
	implements ContatoService, ServiceWrapper<ContatoService> {

	public ContatoServiceWrapper(ContatoService contatoService) {
		_contatoService = contatoService;
	}

	@Override
	public com.liferay.training.contato.model.Contato addContato(
			long groupId, String nome, String telefone, String email, int idade,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoService.addContato(
			groupId, nome, telefone, email, idade, serviceContext);
	}

	@Override
	public boolean checkIfEmailExists(String email) {
		return _contatoService.checkIfEmailExists(email);
	}

	@Override
	public com.liferay.training.contato.model.Contato deleteContato(
			long contatoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoService.deleteContato(contatoId);
	}

	@Override
	public com.liferay.training.contato.model.Contato getContatoById(
			long contatoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoService.getContatoById(contatoId);
	}

	@Override
	public java.util.List<com.liferay.training.contato.model.Contato>
			getContatosByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoService.getContatosByGroupId(groupId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _contatoService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.training.contato.model.Contato updateContato(
			long contatoId, String nome, String telefone, String email,
			int idade)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _contatoService.updateContato(
			contatoId, nome, telefone, email, idade);
	}

	@Override
	public ContatoService getWrappedService() {
		return _contatoService;
	}

	@Override
	public void setWrappedService(ContatoService contatoService) {
		_contatoService = contatoService;
	}

	private ContatoService _contatoService;

}