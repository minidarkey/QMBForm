package com.quemb.qmbform.view;

import com.quemb.qmbform.R;
import com.quemb.qmbform.descriptor.RowDescriptor;
import com.quemb.qmbform.descriptor.Value;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by tonimoeckel on 15.07.14.
 */
public class FormDetailTextVerticalFieldCell extends FormDetailTextFieldCell {

    public FormDetailTextVerticalFieldCell(Context context,
            RowDescriptor rowDescriptor) {
        super(context, rowDescriptor);
    }

    @Override
    protected int getResource() {
        return R.layout.detail_text_vertical_field_cell;
    }
}
