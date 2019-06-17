package com.kodilla.testing.forum.mock;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.statistics.CalculateAdvStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.ForumUser;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumTestSuite;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.mockito.BDDMockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsWithMock {
    @Test
    public void testCalculateAdvStatisticsWhenPostCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        calculateAdvStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calculateAdvStatistics.getAvgPostUsr(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWhenPostCountIsOneThousand() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("user1", "user2", "user3"));
        //When
        calculateAdvStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(333.33, calculateAdvStatistics.getAvgPostUsr(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommCountIsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculateAdvStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calculateAdvStatistics.getAvgCommUser(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommCountLessThanPostCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics();
        when (statisticsMock.commentsCount()).thenReturn(15);
        when (statisticsMock.postsCount()).thenReturn(20);
        //When
        calculateAdvStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.75,  calculateAdvStatistics.getAvgCommPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWhenCommCountGreaterThanPostCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics();
        when (statisticsMock.commentsCount()).thenReturn(20);
        when (statisticsMock.postsCount()).thenReturn(15);
        //When
        calculateAdvStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1.33,  calculateAdvStatistics.getAvgCommPost(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWhenUsrCountIsZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics();
        List<String> usersNames = new ArrayList<String>();
        when (statisticsMock.usersNames()).thenReturn (usersNames);
        //When
        calculateAdvStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, calculateAdvStatistics.getAvgPostUsr(), 0.01);
    }
    @Test
    public void testCalculateAdvStatisticsWhenUsrCountIsOneThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateAdvStatistics = new CalculateAdvStatistics();
        List<String> usersNames = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            usersNames.add("Ala" + i);
        }
        when (statisticsMock.usersNames()).thenReturn (usersNames);
        //When
        calculateAdvStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, calculateAdvStatistics.getAvgCommUser(), 0.01);
    }
}





