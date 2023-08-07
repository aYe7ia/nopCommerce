@smoke
   Feature: verify that user could use wishlist button
   Scenario: user clicks on wishlist button
     Given  user is on home page
     When user clicks on wishlist user is on home page button
     Then success message The product has been added to your wishlist displayed
     And user clicks on wishlist tab
