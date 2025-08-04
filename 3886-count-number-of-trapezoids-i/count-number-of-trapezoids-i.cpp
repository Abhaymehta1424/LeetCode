class Solution {
public:
    const int M = 1e9+7;
    int countTrapezoids(vector<vector<int>>& points) {
        map<int,int> mp;
        for(auto it:points){
            mp[it[1]]++;
        }
        vector<long long> v;
        for(auto it:mp){
            long long k = it.second;
            v.push_back(((k*(k-1)%M)/2)%M);
        }
        int n = v.size(), ans = 0, sum = 0;
        for(int i=n-2; i>=0; i--){
            sum = (sum + v[i+1])%M;
            ans = (ans + (v[i]*sum))%M;
        }
        return ans;
    }
};