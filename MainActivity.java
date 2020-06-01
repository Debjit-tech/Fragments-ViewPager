public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        tab=findViewById(R.id.tab);

        setupViewPager(viewPager);
        tab.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager vpager) {

        Adapter pagerAdapter=new Adapter(getSupportFragmentManager());
        pagerAdapter.addFragments(new Fragment1(),"Users");
        pagerAdapter.addFragments(new Fragment2(),"Invite");
        pagerAdapter.addFragments(new Fragment3(),"Chat");

        vpager.setAdapter(pagerAdapter);
    }

}
