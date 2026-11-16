# MultiLevelRecyclerView

Android library with a `RecyclerView` adapter for lists that have sections and rows.

This is an older sample kept for reference. It is not actively maintained.

## Modules

- `multilevelrecyclerview`: the library (`BaseModal`, `BaseViewHolder`, `BaseRowViewHolder`,
  `GenericRecyclerViewAdapter`, `MultiLevelRecyclerViewAdapter`)
- `myapplication`: a demo app

## How it is used

Extend `MultiLevelRecyclerViewAdapter` and implement two methods that create the view holders:

- `onCreateSectionViewHolder(ViewGroup parent)`
- `onCreateRowViewHolder(ViewGroup parent, Context context)`

Models extend `BaseModal` and view holders extend `BaseViewHolder`.

## Stack

Java, `recyclerview-v7:28.0.0`, `minSdkVersion 15`, `compileSdkVersion 28`.

## License

MIT. See [LICENSE](LICENSE).
