int huWe(uint32_t n) {
    int add=0;
    while(num>0)
    {
        if(num&1)
        {
            add++;
        }
        num>>=1;
    }
    return add;
}
