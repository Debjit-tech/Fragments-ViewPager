public class Adapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragments=new ArrayList<>();
    private final ArrayList<String> fragmentTitle=new ArrayList<>();

    public Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public  void addFragments(Fragment fragment, String title){

        fragments.add(fragment);
        fragmentTitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
