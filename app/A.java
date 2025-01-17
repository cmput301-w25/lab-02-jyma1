cityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataList.add(cityInput.getText().toString());
                cityAdapter.notifyDataSetChanged();
            }
        });


        cityList.setOnItemLongClickListener((parent, view, position, id) -> {
            dataList.remove(position);
            cityAdapter.notifyDataSetChanged();
            return true;
        });
    }
}