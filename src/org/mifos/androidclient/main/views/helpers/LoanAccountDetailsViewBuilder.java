/*
 * Copyright (c) 2005-2011 Grameen Foundation USA
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an
 * explanation of the license and how it is applied.
 */

package org.mifos.androidclient.main.views.helpers;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.mifos.androidclient.R;
import org.mifos.androidclient.entities.account.LoanAccountDetails;
import org.mifos.androidclient.templates.AccountDetailsViewBuilder;

public class LoanAccountDetailsViewBuilder implements AccountDetailsViewBuilder {

    private Context mContext;
    private LoanAccountDetails mDetails;

    public LoanAccountDetailsViewBuilder(Context context, LoanAccountDetails details) {
        mContext = context;
        mDetails = details;
    }

    @Override
    public View buildOverviewView() {
        TextView view = new TextView(mContext);
        view.setText(mContext.getString(R.string.not_implemented_yet_message));
        view.setTextAppearance(mContext, R.style.Info);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
        view.setLayoutParams(params);
        view.setGravity(Gravity.CENTER);
        return view;
    }

    @Override
    public View buildDetailsView() {
        TextView view = new TextView(mContext);
        view.setText(mContext.getString(R.string.not_implemented_yet_message));
        view.setTextAppearance(mContext, R.style.Info);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);
        view.setLayoutParams(params);
        view.setGravity(Gravity.CENTER);
        return view;
    }

}