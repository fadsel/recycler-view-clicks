# Recycler View Clicks (For Android)
This is an effective way for listening on clicks using the recycler view

# Setup
Get your RecyclerView ready, and lets use our classes where we will pass RecyclerTouchListener class. 
This will implement `onClick` and `onLongClick` methods.These methods will listen for the click and long press events on the particular position of the view.

```
recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this,
        recyclerView, new ClickListener() {
    @Override
    public void onClick(View view, final int position) {
        //Values are passing to activity & to fragment as well
        Toast.makeText(MainActivity.this, "Single Tap on position  : " + position,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongClick(View view, int position) {
        Toast.makeText(MainActivity.this, "Long press on position : " + position,
                Toast.LENGTH_LONG).show();
    }
}));
```
**PS: Remember to change your packages **

Enjoy


## Side Note
<a href="https://play.google.com/store/apps/details?id=com.fadsel.stickybubble">
<img src="https://raw.githubusercontent.com/fadsel/Read-CSV/master/sticky-bubble-cover2.jpg" width="800"/>
</a>

## License
<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" href="http://purl.org/dc/dcmitype/Text" property="dct:title" rel="dct:type">Recycler View Clicks</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="https://saficloud.com" property="cc:attributionName" rel="cc:attributionURL">Recycler View Clicks</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Attribution-ShareAlike 4.0 International License</a>.<br />Permissions beyond the scope of this license may be available at <a xmlns:cc="http://creativecommons.org/ns#" href="https://saficloud.com/legal" rel="cc:morePermissions">saficloud.com/legal</a>.

Enjoy
