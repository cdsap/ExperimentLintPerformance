package com.performance.module_0_67

class Feature67UseCase0(
    private val repository: Feature67Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
