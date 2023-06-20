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

package com.liferay.training.contato.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.contato.model.Contato;
import com.liferay.training.contato.service.base.ContatoServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=contato",
		"json.web.service.context.path=Contato"
	},
	service = AopService.class
)
public class ContatoServiceImpl extends ContatoServiceBaseImpl {


	public Contato addContato(long groupId, String nome, String telefone, String email, int idade,
							  ServiceContext serviceContext) throws PortalException {
		return contatoLocalService.addContato(groupId, nome, telefone, email, idade, serviceContext);
	}

	public Contato updateContato(long contatoId, String nome, String telefone, String email, int idade) throws PortalException {
		return contatoLocalService.updateContato(contatoId, nome, telefone, email, idade);
	}

	public List<Contato> getContatosByGroupId(long groupId) throws PortalException {
		return contatoLocalService.getContatosByGroupId(groupId);
	}

	public Contato getContatoById(long contatoId) throws PortalException {
		return contatoLocalService.getContato(contatoId);
	}

	public Contato deleteContato(long contatoId) throws PortalException {
		return contatoLocalService.deleteContato(contatoId);
	}

}