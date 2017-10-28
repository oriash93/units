/* This file is auto generated.
 * DO NOT EDIT IT MANUALLY!
 */

#ifndef INCLUDE_DENSITY_UNITS_H_
#define INCLUDE_DENSITY_UNITS_H_

#include <units/internal/numeric_value.h>
#include <units/internal/utils.h>
#include <units/mass_units.h>
#include <units/volume_units.h>

#include <units/tags/density_tags.h>

namespace units {
namespace density
{

using KilogramsPerCubicMeter = NumericValue<tags::kilograms_per_cubic_meter_tag>;
using KilogramsPerLiter = NumericValue<tags::kilograms_per_liter_tag>;


USER_DEFINED_LITERALS(KilogramsPerCubicMeter, kilograms_per_cubic_meter);
USER_DEFINED_LITERALS(KilogramsPerLiter, kilograms_per_liter);


}
}

#endif /* INCLUDE_DENSITY_UNITS_H_ */