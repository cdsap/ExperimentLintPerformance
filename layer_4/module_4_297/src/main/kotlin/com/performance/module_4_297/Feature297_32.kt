package com.performance.module_4_297

class Feature297UseCase0(
    private val repository: Feature297Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
