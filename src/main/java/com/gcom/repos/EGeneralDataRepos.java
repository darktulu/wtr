package com.gcom.repos;

import com.gcom.beans.EGeneralData;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("eGeneralDataRepos")
public abstract interface EGeneralDataRepos extends JpaRepository<EGeneralData, String>{
  public abstract List<EGeneralData> findByStatus(String paramString);
}

