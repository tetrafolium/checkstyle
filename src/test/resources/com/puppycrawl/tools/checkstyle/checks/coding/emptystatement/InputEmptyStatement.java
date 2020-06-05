package com.puppycrawl.tools.checkstyle.checks.coding.emptystatement;

/**
 * Input class for testing EmptyStatementCheck
 * @author Rick Giles
 * @version 5-May-2003
 */
public class InputEmptyStatement
{
   public InputEmptyStatement()
   {
      
   }

   public void EmptyMethod()
   {
      
   }

   public void EmptyStatements(boolean cond)
   {
      while (cond) ;

      while (cond) {
         ;
      }

      if (true)

      {
         ;
      }

      if (cond)
      {
         
      }

      else
      {
         
      }

      switch (1)
      {
         case 1 :
            
         default :
            
      }

      while (cond) {
          ;
      }

      while (cond)
      {
         ;
      }

      do
      while (cond);

      do
      {
         
      }
      while (cond);

      try
      {
         
      }
      catch (Exception ex)
      {
         
      }
      finally
      {
         
      }
   }
}
