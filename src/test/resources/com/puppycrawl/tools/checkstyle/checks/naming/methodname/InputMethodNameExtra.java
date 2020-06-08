package com.puppycrawl.tools.checkstyle.checks.naming.methodname;

public class InputMethodNameExtra
{
    public void doit()
    {
        Object historyDetails = null;
                Object previousNameService = null;
                Object entityId = null;
                Object agencyName = null;
                createNameHistoryDetails(historyDetails, previousNameService, entityId,
            new More.ViewChangeHistoryBaseAction.ChangeHistoryDisplayName(agencyName)
            {
                String getDisplayName()
                { //comment
                    return getPreviousName();
                }
            });
    }

        private
                        void
                        createNameHistoryDetails(final Object historyDetails, final Object previousNameService,
                                        final Object entityId, final More.ViewChangeHistoryBaseAction.ChangeHistoryDisplayName
                                                        changeHistoryDisplayName)
	{

	}

	protected String getPreviousName()
	{
		return null;
	}

	private void createNameHistoryDetails(final Object historyDetails, final Object previousNameService,
			final Object entityId, final ChangeHistoryDisplayName changeHistoryDisplayName)
	{

	}

	private static class More {
		public static class ViewChangeHistoryBaseAction {
			public static class ChangeHistoryDisplayName {

				public ChangeHistoryDisplayName(final Object agencyName)
				{

				}

			}
		}
	}

	private class ChangeHistoryDisplayName {

	}
}
