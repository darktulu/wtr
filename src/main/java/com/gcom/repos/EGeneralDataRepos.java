package com.gcom.repos;

import com.gcom.beans.EGeneralData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("eGeneralDataRepos")
public interface EGeneralDataRepos extends JpaRepository<EGeneralData, String> {
    List<EGeneralData> findByStatus(String paramString);
}
