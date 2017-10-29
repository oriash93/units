/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_ANGLE_TAGS_H_
#define INCLUDE_ANGLE_TAGS_H_

#include <ratio>
#include <string>


namespace units {
namespace angle {
namespace tags
{

using angle_code  = std::ratio<3, 1>;

struct degrees_tag
{
	using typeCode = angle_code;
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};
struct mils_tag
{
	using typeCode = angle_code;
	static constexpr double scale = 0.05625 * degrees_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};
struct radians_tag
{
	using typeCode = angle_code;
	static constexpr double scale = 57.2957795131 * degrees_tag::scale;
	static std::string singularName();
	static std::string pluralName();
};


}
}
}

#endif /* INCLUDE_ANGLE_TAGS_H_ */