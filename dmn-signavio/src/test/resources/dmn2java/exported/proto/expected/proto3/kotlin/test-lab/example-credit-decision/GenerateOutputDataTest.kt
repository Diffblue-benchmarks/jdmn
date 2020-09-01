
import java.util.*
import java.util.stream.Collectors

@javax.annotation.Generated(value = ["junit.ftl", "9acf44f2b05343d79fc35140c493c1e0/sid-8DBE416B-B1CA-43EC-BFE6-7D5DFA296EB6"])
class GenerateOutputDataTest : com.gs.dmn.signavio.runtime.DefaultSignavioBaseDecision() {
    private val generateOutputData = GenerateOutputData()

    @org.junit.Test
    fun testCase1() {
        val annotationSet_ = com.gs.dmn.runtime.annotation.AnnotationSet()
        val currentRiskAppetite: java.math.BigDecimal? = number("50")
        val lendingThreshold: java.math.BigDecimal? = number("25")
        val applicant: type.Applicant? = type.ApplicantImpl(number("38"), number("100"), "Amy", asList("Late payment"))
        val generateOutputData: List<type.GenerateOutputData?>? = this.generateOutputData.apply(applicant, currentRiskAppetite, lendingThreshold, annotationSet_)

        checkValues(asList(type.GenerateOutputDataImpl(number("27.5"), "Accept", numericUnaryMinus(number("7.5")))), generateOutputData);

        // Make proto request
        var builder_: proto.GenerateOutputDataRequest.Builder = proto.GenerateOutputDataRequest.newBuilder()
        builder_.setCurrentRiskAppetite((if (currentRiskAppetite == null) 0.0 else currentRiskAppetite!!.toDouble()))
        builder_.setLendingThreshold((if (lendingThreshold == null) 0.0 else lendingThreshold!!.toDouble()))
        builder_.setApplicant(type.Applicant.toProto(applicant))
        val generateOutputDataRequest_: proto.GenerateOutputDataRequest = builder_.build()

        // Invoke apply method
        val response_: proto.GenerateOutputDataResponse = this.generateOutputData.apply(generateOutputDataRequest_, annotationSet_)
        val generateOutputDataProto: List<proto.GenerateOutputData?>? = response_.getGenerateOutputDataList()

        // Check results
        checkValues(asList(type.GenerateOutputDataImpl(number("27.5"), "Accept", numericUnaryMinus(number("7.5")))), generateOutputDataProto)
    }

    @org.junit.Test
    fun testCase2() {
        val annotationSet_ = com.gs.dmn.runtime.annotation.AnnotationSet()
        val currentRiskAppetite: java.math.BigDecimal? = number("50")
        val lendingThreshold: java.math.BigDecimal? = number("25")
        val applicant: type.Applicant? = type.ApplicantImpl(number("18"), number("65"), "Bill", asList("Card rejection", "Default on obligations"))
        val generateOutputData: List<type.GenerateOutputData?>? = this.generateOutputData.apply(applicant, currentRiskAppetite, lendingThreshold, annotationSet_)

        checkValues(asList(type.GenerateOutputDataImpl(numericUnaryMinus(number("10")), "Reject", numericUnaryMinus(number("25")))), generateOutputData);

        // Make proto request
        var builder_: proto.GenerateOutputDataRequest.Builder = proto.GenerateOutputDataRequest.newBuilder()
        builder_.setCurrentRiskAppetite((if (currentRiskAppetite == null) 0.0 else currentRiskAppetite!!.toDouble()))
        builder_.setLendingThreshold((if (lendingThreshold == null) 0.0 else lendingThreshold!!.toDouble()))
        builder_.setApplicant(type.Applicant.toProto(applicant))
        val generateOutputDataRequest_: proto.GenerateOutputDataRequest = builder_.build()

        // Invoke apply method
        val response_: proto.GenerateOutputDataResponse = this.generateOutputData.apply(generateOutputDataRequest_, annotationSet_)
        val generateOutputDataProto: List<proto.GenerateOutputData?>? = response_.getGenerateOutputDataList()

        // Check results
        checkValues(asList(type.GenerateOutputDataImpl(numericUnaryMinus(number("10")), "Reject", numericUnaryMinus(number("25")))), generateOutputDataProto)
    }

    @org.junit.Test
    fun testCase3() {
        val annotationSet_ = com.gs.dmn.runtime.annotation.AnnotationSet()
        val currentRiskAppetite: java.math.BigDecimal? = number("50")
        val lendingThreshold: java.math.BigDecimal? = number("25")
        val applicant: type.Applicant? = type.ApplicantImpl(number("65"), number("80"), "Charlie", asList("Late payment", "Default on obligations", "Bankruptcy"))
        val generateOutputData: List<type.GenerateOutputData?>? = this.generateOutputData.apply(applicant, currentRiskAppetite, lendingThreshold, annotationSet_)

        checkValues(asList(type.GenerateOutputDataImpl(numericUnaryMinus(number("42.5")), "Reject", numericUnaryMinus(number("77.5")))), generateOutputData);

        // Make proto request
        var builder_: proto.GenerateOutputDataRequest.Builder = proto.GenerateOutputDataRequest.newBuilder()
        builder_.setCurrentRiskAppetite((if (currentRiskAppetite == null) 0.0 else currentRiskAppetite!!.toDouble()))
        builder_.setLendingThreshold((if (lendingThreshold == null) 0.0 else lendingThreshold!!.toDouble()))
        builder_.setApplicant(type.Applicant.toProto(applicant))
        val generateOutputDataRequest_: proto.GenerateOutputDataRequest = builder_.build()

        // Invoke apply method
        val response_: proto.GenerateOutputDataResponse = this.generateOutputData.apply(generateOutputDataRequest_, annotationSet_)
        val generateOutputDataProto: List<proto.GenerateOutputData?>? = response_.getGenerateOutputDataList()

        // Check results
        checkValues(asList(type.GenerateOutputDataImpl(numericUnaryMinus(number("42.5")), "Reject", numericUnaryMinus(number("77.5")))), generateOutputDataProto)
    }

    private fun checkValues(expected: Any?, actual: Any?) {
        com.gs.dmn.runtime.Assert.assertEquals(expected, actual)
    }
}