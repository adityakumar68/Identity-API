/*
* AMRIT – Accessible Medical Records via Integrated Technology 
* Integrated EHR (Electronic Health Records) Solution 
*
* Copyright (C) "Piramal Swasthya Management and Research Institute" 
*
* This file is part of AMRIT.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see https://www.gnu.org/licenses/.
*/
package com.iemr.common.identity.repo.rmnch;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iemr.common.identity.data.rmnch.RMNCHMBeneficiaryconsent;

@Repository
public interface RMNCHBenConsentRepo extends CrudRepository<RMNCHMBeneficiaryconsent, BigInteger> {
	@Query(" SELECT t FROM RMNCHMBeneficiaryconsent t WHERE t.id = :vanSerialNo AND t.VanID = :vanID")
	public RMNCHMBeneficiaryconsent getByIdAndVanID(@Param("vanSerialNo") BigInteger vanSerialNo,
			@Param("vanID") int vanID);
}
