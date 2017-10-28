/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_VOLUME_TAGS_H_
#define INCLUDE_VOLUME_TAGS_H_

#include <ratio>
#include <string>
#include <units/internal/units_multiply_type.h>
#include <units/tags/length_tags.h>
#include <units/internal/multiplyer_scales.h>


namespace units {
namespace volume {
namespace tags
{

using volume_code  = multiply_type_code<length::tags::length_code, length::tags::length_code, length::tags::length_code>::code;

struct cubic_feet_tag
{
	using typeCode = volume_code;
	static constexpr double scale = multiply_scale_tag<length::tags::feet_tag, length::tags::feet_tag, length::tags::feet_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct cubic_yards_tag
{
	using typeCode = volume_code;
	static constexpr double scale = multiply_scale_tag<length::tags::yards_tag, length::tags::yards_tag, length::tags::yards_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct cubic_meters_tag
{
	using typeCode = volume_code;
	static constexpr double scale = multiply_scale_tag<length::tags::meters_tag, length::tags::meters_tag, length::tags::meters_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct cubic_kilometers_tag
{
	using typeCode = volume_code;
	static constexpr double scale = multiply_scale_tag<length::tags::kilometers_tag, length::tags::kilometers_tag, length::tags::kilometers_tag>::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct liters_tag
{
	using typeCode = volume_code;
	static constexpr double scale = multiplyBy<std::milli>(cubic_meters_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};
struct milliliters_tag
{
	using typeCode = volume_code;
	static constexpr double scale = multiplyBy<std::milli>(liters_tag::scale);
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_VOLUME_TAGS_H_ */