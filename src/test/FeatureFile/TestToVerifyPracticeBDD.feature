Feature: TestToVerifythePracticeForm

  Background:
    Given User launch Application

    Scenario: Verify the PracticeForm
      When User Enter the FirstName
      |FieldName|Value|
      |FirstName  |Radhika |

    And User Enter the LastName
      |FieldName|Value|
      | LastName |C    |


  Scenario: Verify the Email  info

    When User Enter the Email
      |FieldName|Value|
      |UserEmail  |CR@47gmail.com    |

     And User Select the Gender
       |FieldName|Value|
       |Gender  |Female |

    Then User Select the Hobbies

      |FieldName|Value|
      |Mobile  |658565765 |

