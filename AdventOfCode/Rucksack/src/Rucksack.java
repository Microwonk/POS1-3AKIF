
public class Rucksack {
    
    /**
     * 
     * @return sum of all priorities (same letters of the two substrings that are the 2 halves of each String in the allRucksacks String array)
     */

    public static int getSumOfPriorities() {
        int sum = 0, split;
        String first, second;
        for (int i = 0; i < allRucksacks.length; i++) {
            split = allRucksacks[i].length() / 2;
            first = allRucksacks[i].substring(0, split);
            second = allRucksacks[i].substring(split);
            sum = sum + valueAt(commonCharacter(first, second));
        }
        return sum;
    }

    /**
     * 
     * @return sum of all badges (same letters of each set of three Strings from the allRucksacks String array)
     */
    
    public static int getSumOfBadges() {
        int sum = 0;
        for (int i = 0; i < allRucksacks.length; i++) {
            if ((i + 1) % 3 == 0) {
                sum = sum + valueAt(commonCharacterForBadge(allRucksacks[i-2], allRucksacks[i-1], allRucksacks[i]));
            }
        }
        return sum;
    }

    private static String allLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * 
     * @param input any character
     * @return the value 1 through 52, corrensponding to the index charAt of allLetters, when a non-Letter is given 0 is returned.
     */

    private static int valueAt(char input) {
        int i = 0;
        while (i < allLetters.length()) {
            if (input == (allLetters.charAt(i))) {
                return i + 1;
            }
            i++;
        }
        return 0;
    }

    /**
     * 
     * @param s1
     * @param s2
     * @param s3
     * @return the Character s1, s2 and s3 have in common
     */

    static private char commonCharacterForBadge(String s1, String s2, String s3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < s1.length()) {
            while (j < s2.length()) {
                while (k < s3.length()) {
                    if (s1.charAt(i) == s2.charAt(j) && s1.charAt(i) == s3.charAt(k) && s2.charAt(j) == s3.charAt(k)) {
                        return s3.charAt(k);
                    }
                    k++;
                }
                k = 0;
                j++;
            }
            j = 0;
            i++;
        }
        return '?';
    }

    /**
     * 
     * @param s1
     * @param s2
     * @return the character s1 and s2 have in common
     */

    static private char commonCharacter(String s1, String s2) {
        int i = 0;
        int j = 0;
        while (i < s1.length()) {
            while (j < s2.length()) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    return s2.charAt(j);
                }
                j++;
            }
            j = 0;
            i++;
        }
        return '?';
    }

    /**
     * Array of all the Rucksack Items
     */

    private static String[] allRucksacks = {
        "VdzVHmNpdVmBBCpmQLTNfTtMhMJnhFhTTf",
        "FgqsZbqDDFqRrhhJnsnLMTfhJG",
        "bRRRPrRRwSwbDqgjvDZbRbQzpzmQVWCzzBdvQBFCzlWV",
        "GcDdRdvhRssRhGDdShCRtqWjlQzqWgqzNfNjfQWWjt",
        "mwwnnPFwmVrPmJmzfNzqCjQCbgVlgC",
        "nPnHHLrHwmJTrCTJpThBscBSdSLGZvZBvRhZ",
        "RVQQcVlcSRclfZCCCnMJJTSTnC",
        "NdHwjdwjbBBZrrZrbJDZJJ",
        "wmhjGGBGwwmjtjtdPlfRcpVQlhRppVJF",
        "pplbNBPPrppllrFNbpvppSTcwqcWFhTTShhJDTchqd",
        "RGzRfLjjmZmfmwLftTWhStStJWTdWmDm",
        "nfsMjQssnpPvNnrPrw",
        "SjjBgllzlQjBZvlBBgcFbgJHsMhJqbMHPggJbM",
        "hRLRVDdRRWnJqnnHTqMCnH",
        "GRfLddRRpVhNVrWSjwQQzSzcGSBQSc",
        "qMwNqqBdQdnTVBBVVhMVnVFzTHPggTPjGRDzvPTjjmvPDj",
        "sbSrWJpStrtPtRPttzmmDD",
        "pfbJJcbsrcLpWLllsnFmcqcwQncnQQqVNQ",
        "RBTWCMwCwdZThPZcZZ",
        "pVmVpHLFFFHHVgVmvNmHSQNvddlPPzZJMPcdhclhjczLdZMP",
        "vnnNnFStGMRDwWnn",
        "fWDdJTpDJzdBBBdmDSbSRHRwPqbPbHgSbz",
        "slQtQvNsMVvrrgPRgRglnhwWPH",
        "sGMMQFrsjvNMfWmdpfFDFZBf",
        "vnMRMWCMJwWWwwWPjmSdVmLdzvVbLrhL",
        "HsNfDHQlZpNqfQzbLbrqhjLmVdjd",
        "dfDZQsNpstHHHptZDDtZWgngtgBMPMMRwCPtBBGW",
        "HwQwwbwFNWHwHBVFQFLQzRznZnSzcjjjpPbcPpSP",
        "vTfTJsCmsftJZmTSSdPvzdjRSvPdjd",
        "TrGtTJfmGDfDhrhJJJsqrZhDBFLHHLLQWFwwlWBVBBVwgLFD",
        "FFTJRLccQgmTbSsbGm",
        "PBPPqCvCwqwhQQVhQngmVmSgglmGnHbnmb",
        "zqthvtQPBfCCzPwQPtwQzPwNLfNRFNLdLRLFRFFNLFdFdW",
        "nszjQnsPwjznzCCrhJqvjqhmBv",
        "tFWdHGWFGtctlNNpZBBhmqTrrbWqvTBT",
        "dlFtcpHDVVVHFdNGHGpGfQgsPDzSMsQwwPwgLLBQ",
        "TzQqTJGvnnSzqrWTnvfbbcflQcVltfcCMPVM",
        "jFjNZFFJLpFwmBwblcpptcVtfbbVlR",
        "jmmJdBBLNdGDWDDrdzqn",
        "pzddqQmGgbqgGpbJmmdnLZDCRZnZvFlLRZLSlLRT",
        "rVwchcBBMwVBHhHTZCTSGSCRTZlTDr",
        "HtccPfjfBhMtVBGHWpNqJdJdpjNJppWz",
        "WThTWWhtPbZRvvWbbvRTSRMjVRLLgFssgLpVsfSF",
        "JdwrlJcCwfzdqwwjsjzpLMgVsMFgML",
        "lQrwHNGJHClvTmfhBmPQmt",
        "lbRLhcLRpLJzgdGddF",
        "qvhwqDDCVtBDVhfMVGFnzGGzTBnGzGGgFg",
        "VjCwCWCMtjVDtChvQhtffcSmHpNWrrcHZHHZpplWbp",
        "DJVDVdvpmZdPgrCbgbgCJC",
        "lzczcWwwznGhBgPSvTlCrNgqNC",
        "wGzzQhzGGsBBGRBcQwGwnwjmmRHpRfmmMpppMjjHDvLL",
        "HJjJQWjFmmWtFmJTMchghhDwNMhVMWML",
        "SznPSRfRSSPdrrPSShbDVhbLPwcwGGwVNh",
        "ddRfzdRrCrRsZDSnFjspvFvqFqFqTvJt",
        "lflfjQfjvljfbfMLTTDCmHNLNVbL",
        "HSJnRrrJZJssnGRrnsrcqqRnDCLBMhVCTLVLhVNVJBBBhhBm",
        "SsrGGqqnSsWSnnqWHSrPfzftvFdvWlwfQgQwWvzz",
        "nQlsGnFGwwqNJWmJJjpplt",
        "HMTLPTRdvsTCCThDCZdLdLDNNpJBWJbjJMpBmbtNptBWmm",
        "DLCzPzTzZDdLdGSGfSGrsnQGzr",
        "LNPPLHNPHQNQSBFDWDPgggFv",
        "hszfWCWJhrBMsSSBgvFD",
        "GGZjfmJTjmZfrJrZrZJRGwNQnlLNHWjLVjlwdVNHpV",
        "BdNVdTcGVclmTwrTnwPwrHCr",
        "zttBWzfLsCggHPwDrf",
        "szsWSMbWzzbqBbzJjtjsvMzzvdmdVpGllpcRNZZhmRpZcGGc",
        "CjdbMmmmZFnzzgHlttGBVqtBGtsldG",
        "LvPPWNcFSSRslWhBsllT",
        "ppccvLPpcSNwLLwrDNNpLvwJHCMDmbCJbFzgmZZmFgbgnM",
        "TTNRwZqhcTTjsNTTsmrJlvrmmmqqHSrlJH",
        "fLQCCdtcfCDDVbVVQdFbQbdJHMHrJHrHnMllHdMHPrMdln",
        "WfQLQWWDbwRTWcRssN",
        "HQGQWHPDHNjMNQGNWNTWCvZllzqFZqzvvzhCtvFj",
        "DfgwdgfcFpchztvt",
        "sRggdwwVdgmnSTnnDBPBNWLn",
        "WbCZCfTVTTJjSwGdWNDGGw",
        "MMRqggMsqhlmlhrssHgRnRmRvdzdczvdNGNLzScGDrNzrLNc",
        "lRqsnRhmqqQnQpgQMlgDqRfBTJVFbJZQtBCbZQJVZFFb",
        "JnhQcCnmLDsmgmgr",
        "bbMZppRFGGRPfBMMRGMZssTTrLlLfsLlVLdsLsdn",
        "GZGSpPGMZtGGPFFRGBCwhvwjjcnJctvQcvHq",
        "vvrPrHZMGJNRMnqn",
        "BVChWWcDVWsBwCWwGrJNhRLJJnJtLqnq",
        "cjDfcfpWWsfWccBsHgPgrPTdpZbbgggv",
        "GshtVtVtjSCVtVvVGtlVvFZLMvLRZmHmZwbLwZdLdZmR",
        "JWzNDQzjcgJgQBJgzgMwLLHZZcdPwRLwRdHZ",
        "QWTppBWfDrrNBTTfffhFCpVSjnhCGsFtsqSl",
        "nmbCnzHHNzCjCJHJNSCWHLBLrvBrrSGRBDhrDRLrGL",
        "TVtPllwcgdmTRhLQTQhT",
        "fdFtccFcpPmggfdfNzHzCMsbCnWnJs",
        "fMgddvjgRRvjvjVJVdTlZGGtGnrlnqTccNjl",
        "HHSFSWSmmpbBpZlGncrNGbNtrn",
        "WDWBDDBDBDCwPBWBDWNQDgzvVvLRvsVLRwvwdJVLwL",
        "ZSmmvcpsmcJmJvqgBZgZqqtCtZjl",
        "WhDwhFSDgtBFjnFg",
        "rTrSTLWTTHNMNwNrMVddwNNhsmJGQcRsRcJGsJzQJsrzPsPm",
        "GBtLmPsCQqsGqgghZHDzzgLbFz",
        "zjjVTzTlRjRJfznrvrfpnNhFSghbbNFgHrbHZbDHbH",
        "vpfcTJVpcVlfcQPMPCGzCBsd",
        "HMhZNffcPZfNMrzjjFdGcJDjvJ",
        "VSBVVLlSQQmTVSWpSQzDrHzTTvDvFjFdGGzT",
        "mQSplVHWbHLSgWQnShNwsZMZPfbsNCRNCt",
        "MMqvDzLwZzlMqQfdGWPfgPffPglH",
        "ShTcJshsrRdnrdfrrfHp",
        "VVRtFhsCJVJVvwQqDdbDQd",
        "dmnNMlFNvmvljnbpMWNDFQvfQJJGvfPCfHGgQQgcJg",
        "bRVzLBSSTRBRBBrwTrVtRwCfcGHcsJgJgzgGsggHCzcC",
        "ZbtVTTrrqrSSVwhqqwBRwFWMDFNdjdZpWjdDDppjMW",
        "MTzqtbLtwFzJgbHgfbdWWH",
        "VMNBjNVjvNfhhhhfNPhP",
        "jmGMvlDZZnVMtzlwzqqCpwFt",
        "PpzGspGmpPsFLrTnTLzzBg",
        "QCWvfjfWjRPFZgrvqrBvTg",
        "wwNRCNQQVNRWjNWfQbHCCClHGDGJdGhpdhtPGhltDlJD",
        "dhbpGzhllzGlPvnzNcvtNVnc",
        "gcFMsTJDMMwrZqfjjqvvfnPtqJ",
        "sWRWTRFwrTgLDDFWgMsTlpSlpbSCdWWdcbmpChGd",
        "QccdFFFcFbcQPQPHMgpPMp",
        "NJlNSSMLDfJfmlSqHZRNpRqNBRPRPq",
        "LlMmJfvDVVTJSmVMscsCFtvwcjWjrjCj",
        "NVVMGWFSMRVGWSthwhTJWzcJCcJsTs",
        "jqRLqlfRZcmjcCzT",
        "rlRRrdrflpdvPbHpflfPlfDBgBMQpGVQMgpVDGMggBDV",
        "VwRhccRsnQStRhtGQVQVsmjgDgqJdggDjqLDgJlLzmLl",
        "BWFZpWHBNCBCNBzBNvWBpzHZqqlMqgNdlllDdqDgJDLlfDdd",
        "pFbTrrrBzbzTtSwStQnnsrVn",
        "DRfFbFqzbddfPFtsJnJRsnClJRsn",
        "cgjgQgWvSLVQgmWWgWVjVSSSBTltThLnqJssnTCZsTThntZT",
        "qjwpSrmWgcSrGMfdFDFdwHFd",
        "RWjDDWDjDNjjgDtSRRgjcjzFpnzwdFbFNdbFbpnldwFF",
        "vQfPfTQJbZdThTzL",
        "PrBQJQsfQqrrbfmPqMBfJbggjRVgWjttsHRSgRctDjSs",
        "NgqNWqqWWdnJdqpBNFtCmJGCDHttDGDsHsHm",
        "BjvzhRLTrTBQhTMQRjRRcjPGtmDCZZDZSCmmMSSZmVmSSt",
        "vQzRvRzQcPcvfQzRnddppFgnFfWwBFlb",
        "nnPvfvgrtPDHgvvGTRRRPZQGpGCLLV",
        "FlBsBdbllFdfWpbGMCVMZLVbZQ",
        "lhchNcqFsJBlBszztvwHjvzgrzmzffgH",
        "zZhdjTpJJpjmmpPZhvqnnZHqZcggvgMbgv",
        "tFpFQFSFtBGlFNwFfNMnHfbHcnvcvcfvcqrM",
        "GBFlNLSNVGVSSGtQSLLBBlNtphDdzpmmPmTPhRmdzdVCCDdR",
        "rpRCCDLpmnCdJCjn",
        "vMhSFvgsMGLmnmWMmm",
        "wVqFFvwvPPHhFhhgHPwHshpqrDDzqlfRbpftRLblrllr",
        "CRNDzdJCVDWzVgDjdjzRJzWRMTbHsMNZNbZMMbsfhTtMTLMB",
        "wSlwQcSpqPpcqcqFSqpwslsTfZtLhtlthtBHtTMZ",
        "SPGFGFFmpcPGDrWDmjDJVffR",
        "dsmdtJthJphWqHRPnRRsvvnnfR",
        "cDBMDDDlBZglDZTMDfzVvNRrvNPVHzRRTV",
        "PGMCCDClBDDbbFqmmhqQdpWGmmWp",
        "BJjcGhcvCnBdGHsmHSzZDzSDMHmRMQ",
        "qLWPLVrTwWlwwwrfrFfGDNmDQRMbQMzzmmbQLNMM",
        "rVWrFlGqlqwVwVGgWGphnvgBBsnvsjdBnCBnBg",
        "sNNsfBsmcGmgNTcHHSpnTWHnpV",
        "QlrhlrlMglhDQrdFblvFtMdnDWwSHDWWwnTSjLwVDSwwwT",
        "QtdMvltZhbFlPPZbQtQthZQdqCsJJGzBqqCBmCNCqgRCBsfP",
        "SZnQnnHRWRQRVjHnqlJTQPfdlqfJftqG",
        "pDzmbDBFbBLvvzttfdlTTl",
        "gsDLLpcmsSZVwlnRsV",
        "LHsWjwjWqCLsqCHcLsjdLqcdbpMGZPPtBhthbZBpBhMllwPG",
        "VFnVbbvJSfbgphSpGlhRBBSP",
        "JrrTgmFgzvNbrmNnmnvzgTLjCQWDLDCsTjssjqcHLc",
        "QmwwqTqsrdqNNqgtvnVDVcGNNtvv",
        "WBFBpzzjSJBJzJbfntgPzVzcvPnzDf",
        "HcpbHZJBFpjpcSZrZsdRQZrCwrwd",
        "JqmLmbtTWThBTWvWGVSrrVDsSGSG",
        "wwzRzNjNNbsPVPds",
        "jfgQRZwpQclQfffHgpRpwpfTcqtLLqCbbFFFLmbmTTBnFB",
        "fGpcccNNqcctqGMprvMPmbbzFSflSRzPBBlBbS",
        "JCjnjTZTTGPSGmTFPb",
        "ZWHhJjHLDVDgHLLDGjnhctsstwqctNwWqNwwQrtv",
        "sDwQhcwhBDDwrhGsQnRBQHHMHHMNJMZFCFRbCRftMM",
        "zjjlmjqfdTqlWdzTqmLzlzVjNCHJNHNFMFtbJNZgVNMMCCtN",
        "vPTfLmPTLWBsPDnSscnS",
        "ngznwDPPTzhPPDCTQnTTDQBQqHNNrHFVppbbjRFFqFhHqRqr",
        "tZJtcGsGtLLcctRqVBbbqrspbHNq",
        "BmZSvGBMdWPzMPgnnz",
        "MpNWPVNWWZWVVNZHVcvJjgBjJMStMJSjjg",
        "rzdCzrCTTLRCslvJDSjjdScgDm",
        "RLhCQzqTCssThRQzRzwGQrrCFffbfWppNpWNWVcHqZbHpVPp",
        "zQzCVWdSSjCdjpchWcGftflGZcgG",
        "RwnJTJwmvFHTBFmtBccZZfBGMstllM",
        "wwvvHRwqDnHFrmqnrSbQVVQfSbqQjbqjbQ",
        "ttDftStSlftPgSHmJbFwnMnFwzbrLHMMzz",
        "GqTBqhBqBvppBvMMTznrCbCnLwfr",
        "RBjjpZZvvZqGcNhjjpNmDPfDcsgfDfgScsQQQg",
        "rsSFccvBHppHPsvQrSHSprFjnbLGdbzLfbGLLtLjjzLzvl",
        "JWWJhmwwTDTGtnzlhdbtLG",
        "CWNqWRNCwnCJVppQFFFFNrgHBB",
        "MSRVnMjnVRVnPlcsrtMtschgDl",
        "NWHBwJBwBBQCHHqwWQGBNgdrFFtsthcqdltdDsqttq",
        "CCTTGCNCCBfNJNNWbGGnvVzDSRfDRSZvLPSzRn",
        "MpRfjRjWpZzzzRzZSpjzZjTCQcGdHLWNGqdBdcBWWBLccn",
        "lrbrsPQDPQglDtwggcLCqnCdNNdHBLsqNd",
        "blwbJggvgbwlvQbvtgwmvVwRfTzfMMjFVfSFjZjMTSTSzj",
        "ttSGjHWVrwWrWWvhzvhmhDfR",
        "qMBdNNsccQgfDRzRmqlhRl",
        "gQJdfJPdQBsMggMjPrTCLjrGrCrtVT",
        "tGFdlwDwGFdNtStghWWdQFSnTVfCfZhrfVTVCVprnRRhVn",
        "cLsBPQJsQPmbmPHTnRRnHprCVfns",
        "MjmvPqqQjPbQzjLwwDWDSlzSlGSgwl",
        "NSCpFgfbscbZZZwrtgPZJT",
        "zGCQlVGmmQGVqqJwGtHZGrPHHRTH",
        "qQvVmvzmqCdhhjzCQLjljLQMnMDSFWcSfnMfpbfnNcFFbFDN",
        "zFgqjQBmWNlWlfHrHdLc",
        "wnbCpSSZZTJSJSnmdrtHfGtftlcpltpH",
        "ZSwhVPPJgNVmNFzs",
        "WNVJthVHRRfLqpqN",
        "gdCGcCgJBCrgScRLzbjQQLfRRR",
        "SCFdGSFvlhTJsnvW",
        "FFZwFZZwRmFFhHtNLNLGRtsqjLMt",
        "gbDnnrMbMCffMPbPLNjGNlcppNtspp",
        "rgbzrzDrgVgnrBzFWMWmWBwHWHShSB",
        "zjRVjDqzRjvSBnBGGsfsrFsV",
        "fLccLLZpJMctwJWWWJWpJGCwFwsgnngFBPsCnnTBPT",
        "LbJlZNWMtpMlHRNHzdfSDfdj",
        "VGbbnJGSTsVTssTTnVVWMtfBBmvftRHfHBMJJfZp",
        "ghqtrzgPrjdzQCjmZMHfRHZHBmQmmB",
        "gltFtDqFVlTVWlTl",
        "HqNqZDTvNvVTLPSTvzfrfHfdndffwnbdnwrH",
        "MpSJlFcMJmcpFlmClcMcRnWbWtthrnfwnCGrrWfrwC",
        "RjcJJmSFMRQpMRFjMNVvTZjNPPvLTBPBBB",
        "MzClDtlzJzFzNGGm",
        "bjcLRHlTBsFJGmRm",
        "HcPSSfTSpLZLbSwtrtvMnlDCDPCl",
        "gWWgQJCsVhgRLCWsdjpmcBHvfvrrnvCvBB",
        "TqDtztqtStlbNTPtllqZpvmcFHjNjvjNvHvmrrmj",
        "ztPPGZqTPSbJgchGgwRQgQ",
        "wVrdtTqtCCvbNgbNTTDN",
        "mhGzWhGzMGWGrRmbFLBHZRNHNvZvgB",
        "hhGhShpnsSrqVCVSSj",
        "HnlbmGnlHZHnlBcjgwfDVfwLsGLGLDgR",
        "WhWMWTvQPWPLDMFRCDMsVD",
        "QdzJQPSPZqJnJRnZ",
        "TTjTjFBcRBGjwsDTBLmrCftfRVrrCftCVNRP",
        "WnqbJWnnQJhSqVfVPfDnggfrVN",
        "hSlDMllvhbQqllZlSWQdSQTBjsFHBjTwGdHBTBszLzcc",
        "rNWqWDLZWcqFqLLLgQQJnndnQdNzzJVMzd",
        "cPtsPvChtRsGswHPGbwcPcdVnpzvnmBmVvJBJdJVJdzn",
        "PfRfRGtsHsSRftbbbbHhwCCsjZgSTgSZWDTcgDZjLqgqFWLq",
        "BNzPnPJNNMwHJRhBGRWRdjFQddFlFjWd",
        "npbZrgnLSCSrWFjjdlZGlcDF",
        "gqtmmngSbmgHJqfqzNBHBJ",
        "stgzttBPRRRdpSVVpdpS",
        "WJFcLQmJZHcCFLJmcZLMfbpGSWMNpGftSSpMrb",
        "mcvvQvHmtLCJmHZQHZHCDHJJnjqPjjPzwvwhnwPqTjPBzPnB",
        "DDmbbPqgFSbSQPtPQJttrltJ",
        "CRfcnZWmRRhJNVtsVnQlsp",
        "fcBvWvWzcZWCzTTCTTvccFMBHGDdSwGFFbqwFSGSmF",
        "tCRBPCPRjzsJszBmtjmCvSpHcppJpvZdHHHcHZJG",
        "qbrlLnWlQDQDNvmHHHHcrZZvdm",
        "nmnWnnWmgQsCFzFCRVCg",
        "sHMHCDZfcwMcRcLMcZDCRCHMPdJqgjvVdvqgdgfdJbQgvWQb",
        "FFhTzmzGrnmtjTBjBBprrmFtqGgQqvVdPbbgqQQWJvvWJQqV",
        "TrNjrnFSlwNZNlNL",
        "JQGdsdzSzsdFQFSdssnndNlZjNPTJZNljVjTPhVPhT",
        "GgGLfRmHGLhNVjjNTLhV",
        "HvGvwpbHHRwpBrvBgSSzSFndtzndCrsFMd",
        "DptFshMrhDhDwmPPhwSNhmmS",
        "RLdcdRvBjnvRVcvlcLbCcbCwwpGBwSmfZqqPPPPwzmfqZq",
        "VlRLvVjCJLnlpvvRdllLcJJWDHgMMHDDHtWFFDDQgH",
        "SsSdrndpDlCdLftd",
        "VGPVJgmQrVGHHZfwLlfCTmfwlDlT",
        "PcJHcGgcWWbJpjRrphRbFpRn",
        "PdPSMHMLzPPSShBdffMMzMRHQQrpppcqTCQQpCccTGTRCnCQ",
        "vsbWmFbmJmZFFsmsbfpGVrGnWrrpVpnnVcTV",
        "JZslstfZNNSSPdlSMwlM",
        "bLLzRzZLbRqJJrDGGVZdwssDvGQw",
        "FCtNJlTFtmPfldSvDvQFVVsjSv",
        "PmCPHBhhPpWLWgzgHJ",
        "qwmwFHCgPgPPqPwMCrHHFBVVRBttVRRffVfmsjVNNB",
        "WSvcSnvbSWbhcbjlQbvlSQhlfBGcspVVsVGfVscpzpNcpBtN",
        "hJSLhlvlTjPFHMLCCq",
        "bggDpTggncGVVWbQcG",
        "sRvSwwwFBSpFzvRvMFZqmPmMVqmcmPPVqhqqWq",
        "SRBBrFZZwrddBFRjlptnLgDnTggdtd",
        "PPfMcZMflbMQcMllPVfTVMwjWWmZvpWWpWhhjjpdWWww",
        "sDQNnzsnQgDNsFzFqtGjGmWWSpWrGhdpvphdSW",
        "nNQNqLBHLqzDnHgnVJfPJPCRBbfCcJlT",
        "fppppWsjcSDPjjDpGhgwbfTgHTCbHJwbHbTR",
        "rLBdQnvMNMmFPbLqHqTqgLHCgL",
        "nrFznvMNMQdttrBcScsDstWcPGtWSc",
        "lclnRSDnGZtvSwnZDZzhLffqdsCNwTBCBBdNsd",
        "mPjmjmrFFpmQjMJQjlNdlhCsCLsTlNLs",
        "ggmrHHVVQVPJpWrgpWScRvzZzGGRnZvlgzZn",
        "GjGJGQJGcMTVfFDQzNVQzP",
        "mHqdbmmdnJqVzVhRVNzPbR",
        "wStmHJsJsLZLjTvM",
        "QssMbVGdMQjZPjwVwHVZPZClllvgSgvlTgwwSSCgSCtC",
        "WmmFBmJrcFRBFrJJBFchzWCStgCTgvhvTlfsNqfTlvTv",
        "sFzzssDLzrBPjDVVddHMQD",
        "fztDZSGrNrlnbnPTgFFpln",
        "jvvQMMcLcjJmQwHdJvjQJnnbTbRFRphnnpsWgmFRPR",
        "vTLHHCQLHBBjJCSZrVCZtSfSfrft",
        "gHfHffHLjwHrRjLrLRZVMnTdTBsNTBwTVBsBnN",
        "DWPhqhhDhvSGvWPzSzMBQBQVMMBBmvssvQvQ",
        "CDGbqCDbChSbWGrHcHRgbcVcfrLJ",
        "frlTLmtllbbbdpJS",
        "qFjhzjThjHTFGHTjqhhjMzBhVpVpdbBnSJQRpBnVVdbRRQJd",
        "vjWPWjWPPPWgwmfCrNvTvZ",
    };
}
