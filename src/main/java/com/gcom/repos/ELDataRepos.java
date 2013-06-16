package com.gcom.repos;

import com.gcom.beans.ELData;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface ELDataRepos extends JpaRepository<ELData, Integer>
{
  @Query("From ELData d where d.resurceId=:username")
  public abstract List<ELData> findByUsername(@Param("username") String paramString);

  @Query("From ELData d where d.resurceId=:username AND d.leaveType=:type")
  public abstract List<ELData> findByUsernameAndType(@Param("username") String paramString1, @Param("type") String paramString2);

  @Query("From ELData d where d.resurceId=:username AND status='waiting'")
  public abstract List<ELData> findWaiting(@Param("username") String paramString);

  @Query("From ELData d where d.resurceId=:username AND status='waiting' AND leaveType ='Annual Leave'")
  public abstract List<ELData> findAnnualWaiting(@Param("username") String paramString);
  
  @Query("From ELData d where d.resurceId=:username AND status='waiting' AND leaveType ='Compensation Leave'")
  public abstract List<ELData> findCompWaiting(@Param("username") String paramString);

  @Query("From ELData d where d.resurceId=:username AND status='Approved By PM' AND leaveType ='Annual Leave' ")
  public abstract List<ELData> findAnnualApprovedPM(@Param("username") String paramString);

  @Query("From ELData d where d.resurceId=:username AND status='Approved By HR' AND leaveType ='Annual Leave' ")
  public abstract List<ELData> findAnnualApprovedHR(@Param("username") String paramString);
  
  @Query("From ELData d where d.resurceId=:username and (d.status='Approved By HR' or d.status='Approved By PM' or d.status='waiting') AND d.leaveType ='Annual Leave' and   :date >= d.leaveStartDate and :date<=d.leaveEndDate")
  public abstract List<ELData> findPlannedPerDate(@Param("username") String paramString, @Param("date") Date paramDate);
  
  @Query("From ELData d where d.resurceId=:username and d.status='taken' AND d.leaveType='Annual Leave' and :date>=d.leaveStartDate and :date<=d.leaveEndDate")
  public abstract List<ELData> findTakenPerDate(@Param("username") String paramString, @Param("date") Date paramDate);
  
  @Query("From ELData d where d.resurceId=:username and (d.status='Approved By HR' or d.status='Approved By PM' or d.status='waiting' or d.status='taken') AND d.leaveType ='Annual Leave' and :date>= d.leaveStartDate and :date<=d.leaveEndDate and current_date>= d.leaveStartDate and current_date<=d.leaveEndDate")
  public abstract List<ELData> findOngoing(@Param("username") String paramString, @Param("date") Date paramDate);
  
  @Query("From ELData d where d.resurceId=:username and ((YEAR(d.leaveStartDate)=:year and MONTH(d.leaveStartDate)=:month) or (YEAR(d.leaveEndDate)=:year and MONTH(d.leaveEndDate)=:month)) ")
  public abstract List<ELData> goFlag(@Param("username") String paramString, @Param("month") Integer month,@Param("year") Integer year);
  
  
}

