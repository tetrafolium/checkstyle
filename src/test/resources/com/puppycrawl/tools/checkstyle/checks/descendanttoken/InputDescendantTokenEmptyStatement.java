package com.puppycrawl.tools.checkstyle.checks.descendanttoken;

public class InputDescendantTokenEmptyStatement
{
   public InputDescendantTokenEmptyStatement()
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
