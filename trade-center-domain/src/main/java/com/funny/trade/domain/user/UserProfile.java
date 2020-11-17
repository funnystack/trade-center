package com.funny.trade.domain.user;

import com.funny.combo.core.domain.EntityObject;
import com.funny.trade.domain.metrics.appquality.AppQualityMetric;
import com.funny.trade.domain.metrics.devquality.DevQualityMetric;
import com.funny.trade.domain.metrics.techcontribution.ContributionMetric;
import com.funny.trade.domain.metrics.techinfluence.InfluenceMetric;
import com.funny.trade.domain.metrics.weight.Weight;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 员工档案
 * @author frankzhang
 */
@Data
@NoArgsConstructor
public class UserProfile extends EntityObject {
    private static Logger logger = LoggerFactory.getLogger(UserProfile.class);

    private String id;
    private String userId;
    private String userName;
    private String dep;
    private Role role;
    private String isManager;
    private Weight weight;
    private double totalScore;
    private double appQualityScore;
    private double techInfluenceScore;
    private double techContributionScore;
    private double devQualityScore;
    private double checkinCodeQuantity;

    private AppQualityMetric appQualityMetric;
    private InfluenceMetric influenceMetric;
    private ContributionMetric contributionMetric;
    private DevQualityMetric devQualityMetric;

    private static double MAXIMUM_SCORE = 100;
    private static double MINUMUM_SCORE = 0;

    public void calculateScore(){
        calculateTechInfluenceScore();
        calculateTechContributionScore();
        calculateDevQualityMetric();
        calculateAppQualityMetric();
        calculateTotalScore();
    }

    private void calculateAppQualityMetric() {
        appQualityScore = appQualityMetric.calculateScore();
    }

    private void calculateDevQualityMetric(){
        devQualityScore = devQualityMetric.calculateScore();
    }

    private void calculateTechInfluenceScore(){
        techInfluenceScore = influenceMetric.calculateScore();
    }

    private void calculateTechContributionScore(){
        techContributionScore = contributionMetric.calculateScore();
    }

    private void calculateTotalScore(){
        totalScore = round(this.techInfluenceScore) * influenceMetric.getWeight()
                + round(this.techContributionScore) * contributionMetric.getWeight()
                + round(this.devQualityScore) * devQualityMetric.getWeight()
                + round(this.appQualityScore) * appQualityMetric.getWeight();
    }

    private double round(double score){
        if(score > MAXIMUM_SCORE){
            score = MAXIMUM_SCORE;
        }else if(score < MINUMUM_SCORE){
            score = MINUMUM_SCORE;
        }
        return score;
    }

    public UserProfile(String userId){
        this.userId = userId;
    }
}
