package com.google.checkstyle.test.chapter4formatting.rule4842fallthrough;

public class InputFallThrough
{
    void method(final int i, final int j, final boolean cond) {
        while (true) {
            switch (i) {
            case 0: // no problem
            case 1:
                i++;
                break;
            case 2:
                i++;
            case 3: //warn
                i++;
                break;
            case 4:
                return;
            case 5:
                throw new RuntimeException("");
            case 6:
                continue;
            case 7: {
                break;
            }
            case 8: {
                return;
            }
            case 9: {
                throw new RuntimeException("");
            }
            case 10: {
                continue;
            }
            case 11: {
                i++;
            }
            case 12:  //warn
                break;
            case 13:
                {
                    return;
                }
            case 14:  //warn
                {
                    return;
                }
            case 15:  //warn
                while (true) {
                    System.identityHashCode("something");
                    return;
                }
            case 16:
                for (int j1 = 0; j1 < 10; j1++) {
                    System.identityHashCode("something");
                    return;
                }
            case 17:
                while (true) {
                    throw new RuntimeException("");
                }
            case 18:
                while (cond) {
                    break;
                }
            case 19:  //warn
                try {
                    i++;
                    break;
                } catch (RuntimeException e) {
                    break;
                } catch (Error e) {
                    return;
                }
            case 20:
                try {
                    i++;
                    break;
                } catch (RuntimeException e) {
                } catch (Error e) {
                    return;
                }
            case 21:  //warn
                try {
                    i++;
                } catch (RuntimeException e) {
                    i--;
                } finally {
                    break;
                }
            case 22:
                try {
                    i++;
                    break;
                } catch (RuntimeException e) {
                    i--;
                    break;
                } finally {
                    i++;
                }
            case 23:
                switch (j) {
                case 1:
                    continue;
                case 2:
                    return;
                default:
                    return;
                }
            case 24:
                switch (j) {
                case 1:
                    continue;
                case 2:
                    break;
                default:
                    return;
                }
            default:  //warn
                // this is the last label
                i++;
            }
        }
    }



    /* Like above, but all fall throughs with relief comment */
    void methodFallThru(final int i, final int j, final boolean cond) {
      while (true) {
          switch (i) {
          case -1: // FALLTHRU

          case 0: // no problem
          case 1:
              i++;
              break;
          case 2:
              i++;
              // fallthru
          case 3:
              i++;
              break;
          case 4:
              return;
          case 5:
              throw new RuntimeException("");
          case 6:
              continue;
          case 7: {
              break;
          }
          case 8: {
              return;
          }
          case 9: {
              throw new RuntimeException("");
          }
          case 10: {
              continue;
          }
          case 11: {
              i++;
          }
          // fallthru
          case 12:
              break;
          case 13:
              {
                  return;
              }
          case 14:  //warn
              {
                  return;
              }
              // fallthru
          case 15:
              while (true) {
                  System.identityHashCode("something");
                  return;
              }
          case 16:
              for (int j1 = 0; j1 < 10; j1++) {
                  System.identityHashCode("something");
                  return;
              }
          case 17:
              while (cond) {
                  throw new RuntimeException("");
              }
          case 18:
              while (cond) {
                  break;
              }
              // fallthru
          case 19:
              try {
                  i++;
                  break;
              } catch (RuntimeException e) {
                  break;
              } catch (Error e) {
                  return;
              }
          case 20:
              try {
                  i++;
                  break;
              } catch (RuntimeException e) {
              } catch (Error e) {
                  return;
              }
              // fallthru
          case 21:
              try {
                  i++;
              } catch (RuntimeException e) {
                  i--;
              } finally {
                  break;
              }
          case 22:
              try {
                  i++;
                  break;
              } catch (RuntimeException e) {
                  i--;
                  break;
              } finally {
                  i++;
              }
              /* fallthru */
          case 23:
              switch (j) {
              case 1:
                  continue;
              case 2:
                  return;
              default:
                  return;
              }
          case 24:
              i++;
          /* fallthru */ case 25:
              i++;
              break;

          case 26:
              switch (j) {
              case 1:
                  continue;
              case 2:
                  break;
              default:
                  return;
              }
              // fallthru
          default:
              // this is the last label
              i++;
          // fallthru
         }
      }
   }

   /* Test relief comment. */
   void methodFallThruCC(final int i, final int j, final boolean cond) {
      while (true) {
          switch (i) {
          case 0:
              i++; // fallthru

          case 1:
              i++;
          // fallthru
          case 2: {
              i++;
          }
          // fallthru
          case 3:
              i++;
          /* fallthru */case 4:
                break;
          case 5:
              i++;
          // fallthru
          }
      }
   }

   /* Like above, but C-style comments. */
   void methodFallThruC(final int i, final int j, final boolean cond) {
      while (true) {
          switch (i) {
          case 0:
              i++; /* fallthru */

          case 1:
              i++;
          /* fallthru */
          case 2:
              i++;
          /* fallthru */case 3:
                break;
          case 4:
              i++;
          /* fallthru */
          }
      }
   }

   /* Like above, but C-style comments with no spaces. */
   void methodFallThruC2(final int i, final int j, final boolean cond) {
      while (true) {
          switch (i) {
          case 0:
              i++; /*fallthru*/

          case 1:
              i++;
          /*fallthru*/
          case 2:
              i++;
          /*fallthru*/case 3:
                break;
          case 4:
              i++;
          /*fallthru*/
          }
      }
   }

   /* C-style comments with other default fallthru-comment. */
   void methodFallThruCOtherWords(final int i, final int j, final boolean cond) {
      while (true) {
          switch (i) {
          case 0:
              i++; /* falls through */

          case 1:
              i++;
          /* falls through */
          case 2:
              i++;
          /* falls through */case 3:
                break;
          case 4:
              i++;
          /* falls through */
          }
      }
   }

   /* C-style comments with custom fallthru-comment. */
   void methodFallThruCustomWords(final int i, final int j, final boolean cond) {
      while (true) {
          switch (i) {
          case 0:
              i++; /* Continue with next case */

          case 1:  //warn
              i++;
          /* Continue with next case.  */
          case 2:  //warn
              i++;
          /* Continue with next case. */case 3:  //warn
                break;
          case 4:
              i++;
          /* Continue with next case */
          }
      }
   }

   void methodFallThruLastCaseGroup(final int i, final int j, final boolean cond) {
       while (true) {
           switch (i) {
           case 0:
               i++; // fallthru
           }
           switch (i) {
           case 0:
               i++;
               // fallthru
           }
           switch (i) {
           case 0:
               i++;
           /* fallthru */ }
       }
    }

    void method1472228(final int i) {
        switch (i) {
        case 2:
            // do nothing
            break;
        default:
        }
    }

   /* Test relief comment. */
   void methodFallThruWithDash(final int i, final int j, final boolean cond) {
      while (true) {
          switch (i) {
              case 0:
                  i++; // fallthru
              case 1:
                  i++; // fall thru
              case 2:
                  i++; // fall-thru
              case 3:
                  i++; // fallthrough
              case 4:
                  i++; // fall through
              case 5:
                  i++; // fall-through
              case 6:
                  i++; // fallsthru
              case 7:
                  i++; // falls thru
              case 8:
                  i++; // falls-thru
              case 9:
                  i++; // fallsthrough
              case 10:
                  i++; // falls through
              case 11:
                  i++; // falls-through
              case 12:
                  i++; // fall--through
              case 13: //warn
                  i++; // fall+through
              case 14: //warn
                  i++; // falls_thru
              case 15: //warn
                  i++; // falls=through
              case 16: //warn
                  i++; // falls-throug
              default: //warn
                  throw new RuntimeException();
          }
      }
   }
}
