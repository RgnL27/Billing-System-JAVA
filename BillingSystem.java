package javaapplication22;

import javax.swing.*;


public class JavaApplication22 {

    public static void main(String[] args) {
        char question = 0; // char , dont change it!
        double payone, paytwo, paythree;//this are to be input as a enter amount to pay
        
       //code for Meralco by CLAY
        int account_id;// id number for customer
        String account_password;// password for account id
        double enter_cash = 0;
    double bill = 1829.94;
     
        //ManilaWater codes by rgnl
        String MW_acc;
        double MWvat=23.29, total=218.39;
        double enter_cashtwo = 0;
        
       //Pldt code //1,097.01
       double pldt_tot;
       String PLDT_acc;
        double due = 1097.01;
      double computation = 0;//this computation is for meralco and can use to other too.
       
       
     while (question !='x')
     {
      question =JOptionPane.showInputDialog(null,"What would you like to pay?"
                                                   + "\n\nPress [a] to pay Meralco Bill"
                                                   + "\nPress [b] to pay PLDT Bill"
                                                   + "\nPress [c] to pay Manila Water Bill"
                                                   + "\n\nPress [x] to EXIT","Billing",JOptionPane.QUESTION_MESSAGE).charAt(0) ;  
      
      if (question == 'a' || question == 'A')//code of meralco
      {
        JOptionPane.showMessageDialog(null,"        Welcome to Meralco Billing!"
                                         + "\nMake sure you are already registered!");
                                         
                                        
         account_id = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Account ID:","Meralco Login",JOptionPane.PLAIN_MESSAGE));                  
         
         
         if (account_id == 12345678)
         {
          enter_cash = Integer.parseInt(JOptionPane.showInputDialog(null,"Hello! Our Valuable Customer!"
                                                                       + "\n\nService Info"
                                                                       +"\n____________________________________________________________________"
                                                                       + "\nService ID Number:            348576040101"
                                                                       + "\nRate:                                       Residential"
                                                                       + "\nContract in the name of:    Juan Dela Cruz"
                                                                       + "\nService Address:                 Pateros" 
                                                                      + "\n\n"
                                                                       + "Billing Info"
                                                                       +"\n____________________________________________________________________"
                                                                       + "\nBill Date:                                   18 June 2019"
                                                                       + "\nMeter Reading Date:             16 June 2019"
                                                                       + "\nBill Period:                               17 May 2019 to 16 June 2019"
                                                                       + "\nDue Date:                                 27 June 2019"
                                                                       + "\nTotal KWH:                              184"
                                                                       + "\nTotal current amount:          Php1,829.94"
                                                                       + "\nNext Meter Reading:             17 July 2019"
                                                                       +"\n____________________________________________________________________"            
                                                                       + "\n\nEnter Cash Value:","Meralco Billing",JOptionPane.INFORMATION_MESSAGE));
           if (enter_cash <= 1829.94)
                 {
                  JOptionPane.showMessageDialog(null,"Insufficient Balance"
                                                    + "\n(Automatic EXIT after this ERROR!)","Error Message",JOptionPane.ERROR_MESSAGE);
                  System.exit(0);
                 }
         if (enter_cash >=1829.94)
             computation = (enter_cash-bill); 
          JOptionPane.showMessageDialog(null,"Reference No.:                     1-4854768888000344"
                                           + "\nTPAID/User:                           Machine"
                                           + "\nBranch:                                   Pateros"
                                           + "\nAddress:                                 Pateros"
                                           +"\n____________________________________________________________"
                                           + "\n\nDate/Time:                              N/A " 
                                           + "\nBiller:                                       Meralco"
                                           + "\nAccount No:                           12345678"
                                           +"\n____________________________________________________________"
                                           + "\n\n"
                                           + "\nCash:                                        "+enter_cash
                                           + "\nCHECK:                                     0.00"
                                           + "\nCurrent CHARGES:                1,829.94"
                                           + "\n___________________________________________________________"
                                           + "\nChange:                         "+computation,"Bayad Center - Meralco",JOptionPane.INFORMATION_MESSAGE);
         }
        
            else
         {
           JOptionPane.showMessageDialog(null,"WRONG ACCOUNT NUMBER OR YOU ARE NOT REGISTERED TO OUR SYSTEM!","Bayad Center Message",JOptionPane.ERROR_MESSAGE);  
         }
   
      }// end code of meralco billing
        
      
      
      
      
      
      
      
     if (question == 'b' || question == 'B')//pldt code
      {
          PLDT_acc=JOptionPane.showInputDialog(null, "Enter Account number", "PLDT",JOptionPane.INFORMATION_MESSAGE);
          
          if(PLDT_acc.equals("12345678"))
          {
             paytwo = Integer.parseInt(JOptionPane.showInputDialog(null,"Juan Dela Cruz"
                      + "\n123 Yellow Bell Street, Pembo, Makati City"
                      + "\n\n"
                      + "\nStatement of Account"
                      + "\nStatement Date: Mar 12, 2019"
                      + "\nBilling Period Covering: Mar 12, 2019 - April 12, 2019"
                      + "\nBIR CAS Permit No. 1008-116-00007-CAS"
                      + "\n\n\n---------------------------------------------ACCOUNT INFORMATION-------------------------------------------------------------"
                      + "\nAccount Number                                                                                                                 12345678"
                      + "\n\n"
                      + "\nSTATEMENT SUMMARY"
                      + "\nBalance from Previous Bill"
                      + "\n______________________________________________________________________________________"
                      + "\nAmount Due from Previous Bill                                                                                         -5.69"
                      + "\nLess Payments (Thank you - Official Receipt enclosed)                                              -1,100.00"
                      + "\n___________________________"
                      + "\nRemaining Balance from Previous Bill                                                                              -1,105.69"
                      + "\n\nCurrent Bill Charges"
                      + "\n___________________________"
                      + "\nData Charges and Subscriptions                                                                                         355.36"
                      + "\nHOME ULTERA PLAN 699(03/12/2019 - 04/12/2019)                                                        624.11"
                      + "\nVAT @ 12%                                                                                                                                117.54"
                      + "\n___________________________"
                      + "\nTotal Current Bill Charges                                                                                                     1,097.01"
                      +"\n\nEnter Cash Value:","PLDT",JOptionPane.INFORMATION_MESSAGE));
              
             
              
              if(paytwo >=1097)
              {
                  pldt_tot=paytwo-due;
                  JOptionPane.showMessageDialog(null, "Reference No.:                     1-4854768888000344"
                                           + "\nTPAID/User:                           Machine"
                                           + "\nBranch:                                   Pateros"
                                           + "\nAddress:                                 Pateros"
                                           +"\n____________________________________________________________"
                                           + "\n\nDate/Time:                              N/A " 
                                           + "\nBiller:                                       PLDT"
                                           + "\nAccount No:                           12345678"
                                           +"\n____________________________________________________________"
                                           + "\n\n"
                                           + "\nCash:                                        "+paytwo
                                           + "\nCHECK:                                     0.00"
                                           + "\nCurrent CHARGES:                1,097.01"
                                           + "\n___________________________________________________________"
                                           + "\nChange:                                   "+pldt_tot,"Bayad Center - PLDT",JOptionPane.INFORMATION_MESSAGE);
              }
              else
              {
                  JOptionPane.showMessageDialog(null, "Insufficient Amount","ERROR",JOptionPane.ERROR_MESSAGE);
              }
          }
          else
          {
              JOptionPane.showMessageDialog(null, "Invalid Account Number","ERROR",JOptionPane.ERROR_MESSAGE);
          }
      }// end code of pldt
     
     
     
     
     
     
     
     
      
      if (question == 'c' || question == 'C')//manila water code
      {
          MW_acc= JOptionPane.showInputDialog(null,"\nEnter Contract Number:","Manila Water Login",JOptionPane.QUESTION_MESSAGE);
          
          if(MW_acc.equals("12345678"))
          {
              enter_cashtwo = Double.parseDouble(JOptionPane.showInputDialog(null,"Service Information"
                      + "\n____________________________________________________________________________________"
                      + "\nContract Account No.               "+MW_acc
                      + "\nAccount Name:                           Juan Dela Cruz"
                      + "\nService Address:                       123 Yellow Bell Street, Pembo, Makati City"
                      + "\nRate Class:                                   Residential"
                      + "\nBusiness Area:                            Makati"
                      + "\n\n"
                      + "Billing Information"
                      + "\n____________________________________________________________________________________"       
                      + "\nBill Date                                       12 March 2019"
                      + "\nBilling Period                             12 February 2019 to 12 March 2019"
                      + "\nConsumption                             15 cubic meter"
                      + "\nTotal Amount Due                     Php. 218.39"
                      + "\nDue Date                                     17 March 2019"
                      + "\n\n"
                      +"Billing Details"
                      + "\n____________________________________________________________________________________"
                      + "\nCURRENT CHARGES:                                           Php. 218.39"
                      + "\n  Basic Charge:                                                     58.82"
                      + "\n  FCDA:                                                                    2.68"
                      + "\n  Environmental Charge:                                    32.10"
                      + "\n  Maintenance Service Charge:                       1.50"
                      + "\n  Total Current Charge Before Tax                  195.10"
                      + "\n  Add VAT(12%)                                                    23.29"
                      + "\nOTHER CHARGES                                                Php 0.00"
                      + "\nPREVIOUS UNPAID AMOUNT                            Php 0.00"
                      + "\n____________________________________________________________________________________"        
                      + "\nTOTAL AMOUNT DUE                                          Php 218.39"
                              + "\n\nEnter Cash Value:","Manila Water Billing",JOptionPane.PLAIN_MESSAGE));
              
              
              if(enter_cashtwo >=218.39)
              {
                  computation = (enter_cashtwo-total);
                   JOptionPane.showMessageDialog(null,"Reference No.:                     1-4854768888000344"
                                           + "\nTPAID/User:                           Machine"
                                           + "\nBranch:                                   Pembo"
                                           + "\nAddress:                                 Pembo"
                                           +"\n____________________________________________________________"
                                           + "\n\nDate/Time:                              N/A " 
                                           + "\nBiller:                                       Manila Water"
                                           + "\nAccount No:                           12345678"
                                           +"\n____________________________________________________________"
                                           + "\n\n"
                                           + "\nCash:                                        "+enter_cashtwo
                                           + "\nCHECK:                                     0.00"
                                           + "\nCurrent CHARGES:                218.39"
                                           + "\n___________________________________________________________"
                                           + "\nChange:                         "+computation,"Bayad Center - Meralco",JOptionPane.INFORMATION_MESSAGE);
              }
              else
              {
                  JOptionPane.showMessageDialog(null, "Insufficient Balance","ERROR",JOptionPane.WARNING_MESSAGE);
              }
          }
          else
          {
              JOptionPane.showMessageDialog(null, "Invalid Contract Number","Bayad Center Message",JOptionPane.ERROR_MESSAGE);
          }
         
      }//end code of manila water
     
      if(question == 'x' || question == 'X')//code for exit
      {
          JOptionPane.showMessageDialog(null,"EXCEMPTED NA KAMI! CONGRATS! THANK YOU SIR!"
                                           + "\n\nWE LOVE YOU SIR JONATHAN ROSARIO! AHOOOO!");
         System.exit(0);
      }
      
      
     }

   } // oh man!     
    
}//what are you doing here?
    
