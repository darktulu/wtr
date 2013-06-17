package com.gcom.repos;

import com.gcom.beans.EGeneralData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EGeneralDataRepos extends JpaRepository<EGeneralData, String> {
    List<EGeneralData> findByStatus(String paramString);
}
