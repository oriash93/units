/*
 * duration_units.h
 *
 *  Created on: Jun 29, 2017
 *      Author: sagis
 */

#ifndef INCLUDE_DURATION_UNITS_H_
#define INCLUDE_DURATION_UNITS_H_

#include "units/include/numeric_value.h"
#include "units/include/multiplyer_scales.h"

#include <chrono>

namespace units {
namespace duration
{

struct duration_tag { static constexpr int code = 5;};

template<class ChronoClass, class... Tags>
class Duration : public NumericValue<Tags...>
{
private:
	using _selfType = Duration<ChronoClass, Tags...>;
public:
	constexpr Duration() : NumericValue<Tags...>{} {};
	constexpr Duration(double value) : NumericValue<Tags...>{value} {};
	constexpr Duration(const ChronoClass& value)
	: NumericValue<Tags...>{(double)value.count()}
	{
	}
	constexpr Duration(const _selfType& other) = default;
	constexpr Duration(_selfType&& other) = default;
	constexpr _selfType& operator=(const _selfType& other) = default;
};


struct seconds_tag
{
	static constexpr double scale = 1;
	static std::string singularName();
	static std::string pluralName();
};

struct minutes_tag
{
	static constexpr double scale = 60;
	static std::string singularName();
	static std::string pluralName();
};

struct hours_tag
{
	static constexpr double scale = 3600;
	static std::string singularName();
	static std::string pluralName();
};

struct days_tag
{
	static constexpr double scale = 86400;
	static std::string singularName();
	static std::string pluralName();
};

struct years_tag
{
	static constexpr double scale = 31536000;
	static std::string singularName();
	static std::string pluralName();
};

using Microseconds = Duration<
		std::chrono::microseconds,
		micro<seconds_tag>,
		duration_tag>;
using Milliseconds = Duration<
		std::chrono::milliseconds,
		milli<seconds_tag>,
		duration_tag>;
using Seconds = Duration<std::chrono::seconds, seconds_tag, duration_tag>;
using Minutes = Duration<std::chrono::minutes, minutes_tag, duration_tag>;
using Hours = Duration<std::chrono::hours, hours_tag, duration_tag>;
using Days = NumericValue<days_tag, duration_tag>;
using Years = NumericValue<years_tag, duration_tag>;

}
}

#endif /* INCLUDE_DURATION_UNITS_H_ */
