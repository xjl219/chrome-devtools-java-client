package com.github.kklisura.cdt.protocol.types.systeminfo;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2019 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;
import java.util.Map;

/** Provides information about the GPU(s) on the system. */
public class GPUInfo {

  private List<GPUDevice> devices;

  @Optional private Map<String, Object> auxAttributes;

  @Optional private Map<String, Object> featureStatus;

  private List<String> driverBugWorkarounds;

  /** The graphics devices on the system. Element 0 is the primary GPU. */
  public List<GPUDevice> getDevices() {
    return devices;
  }

  /** The graphics devices on the system. Element 0 is the primary GPU. */
  public void setDevices(List<GPUDevice> devices) {
    this.devices = devices;
  }

  /** An optional dictionary of additional GPU related attributes. */
  public Map<String, Object> getAuxAttributes() {
    return auxAttributes;
  }

  /** An optional dictionary of additional GPU related attributes. */
  public void setAuxAttributes(Map<String, Object> auxAttributes) {
    this.auxAttributes = auxAttributes;
  }

  /** An optional dictionary of graphics features and their status. */
  public Map<String, Object> getFeatureStatus() {
    return featureStatus;
  }

  /** An optional dictionary of graphics features and their status. */
  public void setFeatureStatus(Map<String, Object> featureStatus) {
    this.featureStatus = featureStatus;
  }

  /** An optional array of GPU driver bug workarounds. */
  public List<String> getDriverBugWorkarounds() {
    return driverBugWorkarounds;
  }

  /** An optional array of GPU driver bug workarounds. */
  public void setDriverBugWorkarounds(List<String> driverBugWorkarounds) {
    this.driverBugWorkarounds = driverBugWorkarounds;
  }
}
