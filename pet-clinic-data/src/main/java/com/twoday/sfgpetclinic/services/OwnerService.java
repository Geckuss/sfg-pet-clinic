package com.twoday.sfgpetclinic.services;

import com.twoday.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
