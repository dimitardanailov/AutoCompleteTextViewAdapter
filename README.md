# AutoCompleteTextViewAdapter

Current solution give answer how we can style our Autocomplete popup window

**Activity**

```java
ArrayAdapter<String> myCustomAdapter = new ArrayAdapter<String>(this, R.layout.text_custom_view, countriesNames);

final AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.auto_complete_text_view);
textView.setAdapter(myCustomAdapter);
```

**XML with Custom TextView**

```xml
<?xml version="1.0" encoding="utf-8"?>
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/country_name"
    style="@style/CustomTextView"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:singleLine="true" />
```

**Final Result**

![AutoCompleteTextViewAdapter][1]

  [1]: http://i.stack.imgur.com/nV1dI.png