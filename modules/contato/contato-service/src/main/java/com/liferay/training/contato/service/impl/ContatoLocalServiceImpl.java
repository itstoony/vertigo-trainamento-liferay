/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.training.contato.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.training.contato.model.Contato;
import com.liferay.training.contato.service.ContatoLocalServiceUtil;
import com.liferay.training.contato.service.base.ContatoLocalServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
        property = "model.class.name=com.liferay.training.contato.model.Contato",
        service = AopService.class
)
public class ContatoLocalServiceImpl extends ContatoLocalServiceBaseImpl {


    public Contato addContato(long groupId, String nome, String telefone, String email, int idade,
                              ServiceContext serviceContext) throws PortalException {

        if (checkIfEmailExists(email)) {
            throw new PortalException("Email já existente");
        }

        Group group = GroupLocalServiceUtil.getGroup(groupId);
        long userId = serviceContext.getUserId();
        User user = UserLocalServiceUtil.getUser(userId);

        long contatoId = counterLocalService.increment(Contato.class.getName());

        Contato contato = createContato(contatoId);
        contato.setGroupId(groupId);
        contato.setCompanyId(group.getCompanyId());
        contato.setUserId(userId);
        contato.setUserName(user.getScreenName());
        contato.setCreateDate(new Date());
        contato.setModifiedDate(new Date());

        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);
        contato.setIdade(idade);

        return super.addContato(contato);
    }

    public Contato updateContato(long contatoId, String nome, String telefone, String email, int idade) throws PortalException {

        Contato contato = getContato(contatoId);

        if (!contato.getEmail().equals(email) && (checkIfEmailExists(email))) {
            throw new PortalException("Email já existente");
        }

        contato.setModifiedDate(new Date());
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);
        contato.setIdade(idade);

        contato = super.updateContato(contato);

        return contato;
    }

    public List<Contato> getContatosByGroupId(long groupId) {
        return contatoPersistence.findBygroupId(groupId);
    }

    public Contato getContatoById(long id) throws PortalException {
        return contatoLocalService.getContato(id);
    }

    public Contato deleteContato(long contatoId) throws PortalException {
        Contato contato = contatoLocalService.getContato(contatoId);
        return super.deleteContato(contato);
    }

    public List<Contato> getContatosByUser(ServiceContext serviceContext) throws PortalException {
        long userId = serviceContext.getUserId();

        DynamicQuery dynamicQuery = ContatoLocalServiceUtil.dynamicQuery();

        dynamicQuery.add(RestrictionsFactoryUtil.eq("userId", userId));

        return ContatoLocalServiceUtil.dynamicQuery(dynamicQuery);

    }
    public boolean checkIfEmailExists(String email) {
        try {
            DynamicQuery dynamicQuery = ContatoLocalServiceUtil.dynamicQuery();

            dynamicQuery.add(RestrictionsFactoryUtil.eq("email", email));

            int count = (int) ContatoLocalServiceUtil.dynamicQueryCount(dynamicQuery);

            return count > 0;
        } catch (SystemException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public Contato updateContato(Contato contato) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public Contato addContato(Contato contato) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override
    public Contato deleteContato(Contato contato) {
        throw new UnsupportedOperationException("Not supported");
    }
}